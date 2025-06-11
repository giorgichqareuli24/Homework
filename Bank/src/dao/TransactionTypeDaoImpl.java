package dao;

import entity.TransactionType;
import util.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionTypeDaoImpl implements TransactionTypeDao {
        private final Connection connection;

    {
        try {
            connection = DatabaseConnectionManager.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public TransactionType findByTransactionTypeName(String name) {
        String sql = "SELECT * FROM transaction_types WHERE transaction_type_name = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new TransactionType(rs.getLong("id"), rs.getString("transaction_type_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find transaction type by name", e);
        }
        return null;
    }

}
