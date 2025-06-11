package entity;

public class TransactionType {
    private long id;
    private String transactionTypeName;

    public TransactionType() {}

    public TransactionType(long id, String transactionTypeName) {
        this.id = id;
        this.transactionTypeName = transactionTypeName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    @Override
    public String toString() {
        return "TransactionType{" +
                "id=" + id +
                ", transactionTypeName='" + transactionTypeName + '\'' +
                '}';
    }
}
