package service;

import dao.TransactionDao;
import dao.TransactionDaoImpl;
import entity.Transaction;
import java.util.List;

public class TransactionService {
    private final TransactionDao transactionDao = new TransactionDaoImpl();
    public List<Transaction> getUserTransactions(String iban) {
        return transactionDao.findAllByIban(iban);
    }

}
