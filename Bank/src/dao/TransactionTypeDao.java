package dao;

import entity.TransactionType;

public interface TransactionTypeDao {
    TransactionType findByTransactionTypeName(String name);
}
