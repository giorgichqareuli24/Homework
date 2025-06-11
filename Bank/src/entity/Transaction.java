package entity;

import java.sql.Timestamp;

public class Transaction {
    private long id;
    private User fromUser;
    private User toUser;
    private double amount;
    private Timestamp transactionTime;
    private TransactionType type;

    public Transaction() {}

    public Transaction(long id, User fromUser, User toUser, double amount, Timestamp transactionTime, TransactionType type) {
        this.id = id;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.type = type;
    }

    public Transaction(User fromUser, User toUser, double amount, Timestamp transactionTime, TransactionType type) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public void setToUser(User toUser) {
        this.toUser = toUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Timestamp transactionTime) {
        this.transactionTime = transactionTime;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", fromUser=" + fromUser.getIban() +
                ", toUser=" + toUser.getIban() +
                ", amount=" + amount +
                ", transactionTime=" + transactionTime +
                ", type=" + type.getTransactionTypeName() +
                '}';
    }
}
