package dao;

import entity.Transaction;
import java.util.List;

public interface TransactionDao {
    void create(Transaction tx);

    List<Transaction> findBySenderIBAN(String iban);

    List<Transaction> findAllByIban(String iban);
}
