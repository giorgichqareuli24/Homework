package dao;

import entity.Transaction;
import entity.TransactionType;
import entity.User;
import util.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {
    private final Connection connection;

    {
        try {
            connection = DatabaseConnectionManager.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Transaction tx) {
        String sql = "INSERT INTO transactions (from_user, to_user, amount, transaction_time, type_id) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, tx.getFromUser().getId());
            stmt.setLong(2, tx.getToUser().getId());
            stmt.setDouble(3, tx.getAmount());
            stmt.setTimestamp(4, tx.getTransactionTime());
            stmt.setLong(5, tx.getType().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create transaction", e);
        }
    }

    @Override
    public List<Transaction> findBySenderIBAN(String iban) {
        String sql = "SELECT * FROM transactions t JOIN users u ON t.from_user = u.id WHERE u.iban = ?";
        return findTransactions(sql, iban);
    }

    @Override
    public List<Transaction> findAllByIban(String iban) {
        return List.of();
    }


    private List<Transaction> findTransactions(String sql, String iban) {
        List<Transaction> transactions = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, iban);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Transaction tx = new Transaction();
                tx.setId(rs.getLong("id"));
                tx.setAmount(rs.getDouble("amount"));
                tx.setTransactionTime(rs.getTimestamp("transaction_time"));

                User fromUser = new User();
                fromUser.setId(rs.getLong("from_user"));
                tx.setFromUser(fromUser);

                User toUser = new User();
                toUser.setId(rs.getLong("to_user"));
                tx.setToUser(toUser);

                TransactionType type = new TransactionType();
                type.setId(rs.getLong("type_id"));
                tx.setType(type);

                transactions.add(tx);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find transactions", e);
        }
        return transactions;
    }
}
