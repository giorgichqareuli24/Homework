public class BankAccount {
    private String accountHolder;
    private Double balance;
    private String[] transactionHistory;
    private int transactionCount;
    private boolean accountLock;


    public BankAccount(String accountHolder, Double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new String[10];
        this.transactionCount = 0;
        this.accountLock = false;
    }


    public double calculateDeposit(double amount, int months) {
        if (accountLock) {
            System.out.println("ანგარიში დაბლოკილია. კალკულაცია შეუძლებელია.");
            return 0;
        }

        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }


    public void printTransactionHistory() {
        if (transactionHistory != null) {
            for (String transaction : transactionHistory) {
                if (transaction != null) {
                    System.out.println(transaction);
                }
            }
        } else {
            System.out.println("ტრანზაქციების ისტორია არ არსებობს.");
        }
    }


    public boolean transferMoney(BankAccount recipient, double amount) {
        if (accountLock) {
            System.out.println("ანგარიში დაბლოკილია. ტრანზაქცია შეუძლებელია.");
            return false;
        }

        if (amount > 1000) {
            System.out.println("გადარიცხვა ვერ მოხდება, რადგან თანხა 1000 დოლარს აღემატება.");
            return false;
        }

        if (this.balance >= amount) {
            this.balance -= amount;
            recipient.balance += amount;

            addTransactionHistory("გადარიცხულია " + amount + " დოლარი ანგარიშზე " + recipient.accountHolder);

            recipient.addTransactionHistory("მიღებულია " + amount + " დოლარი ანგარიშიდან " + this.accountHolder);

            System.out.println("გადარიცხვა წარმატებით განხორციელდა!");
            return true;
        } else {
            System.out.println("არ არის საკმარისი ბალანსი.");
            return false;
        }
    }

    public void lockAccount() {
        this.accountLock = true;
        System.out.println("ანგარიში დაბლოკილია.");
    }

    public void unlockAccount() {
        this.accountLock = false;
        System.out.println("ანგარიში გახსნილია.");
    }

    private void addTransactionHistory(String transaction) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = transaction;
        } else {
            System.out.println("ტრანზაქციების ისტორია გაივსო!");
        }
    }


    public double getBalance() {
        return balance;
    }
}
