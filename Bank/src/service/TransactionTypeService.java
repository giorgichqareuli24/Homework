package service;

import dao.TransactionTypeDao;
import dao.TransactionTypeDaoImpl;
import entity.TransactionType;

public class TransactionTypeService {
    private final TransactionTypeDao transactionTypeDao = new TransactionTypeDaoImpl();

}
