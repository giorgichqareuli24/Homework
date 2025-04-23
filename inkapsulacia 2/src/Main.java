public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("გიორგი ჩქარეული", 5000.0);
        BankAccount account2 = new BankAccount("ზვიად თურმანიძე", 300.0);

        System.out.println("გიორგი ჩქარეულის ტრანზაქციები:");
        account1.printTransactionHistory();
        System.out.println();
        System.out.println("ზვიად თურმანიძის ტრანზაქციები:");
        account2.printTransactionHistory();

        System.out.println();
        System.out.println("გადარიცხვა -> (500 დოლარი):");
        boolean transfer1 = account1.transferMoney(account2, 500);


        if (transfer1) {
            System.out.println();
            System.out.println("გადარიცხვის შემდეგ:");
            System.out.println("გიორგი ჩქარეულის ბალანსი: " + account1.getBalance());
            System.out.println("ზვიად თურმანიძის ბალანსი: " + account2.getBalance());
        }


        account1.lockAccount();

        System.out.println();
        System.out.println("ტრანზაქცია დაბლოკილ ანგარიშზე -> (200 დოლარი):");
        account1.transferMoney(account2, 200);

        account1.unlockAccount();
        System.out.println();
        System.out.println("ტრანზაქცია გახსნის შემდეგ -> (200 დოლარი):");
        boolean transfer2 = account1.transferMoney(account2, 200);

        if (transfer2) {
            System.out.println();
            System.out.println("გადარიცხვის შემდეგ:");
            System.out.println("გიორგი ჩქარეულის ბალანსი: " + account1.getBalance());
            System.out.println("ზვიად თურმანიძის ბალანსი: " + account2.getBalance());
        }

        System.out.println();
        System.out.println("ანაბრის კალკულატორი:");
        double depositAmount = 1000.0;
        int months = 12;
        double finalAmount = account1.calculateDeposit(depositAmount, months);

        System.out.println();
        System.out.println("საწყისი თანხა: " + depositAmount + " ლარი");
        System.out.println("ვადის ხანგრძლივობა: " + months + " თვე" + (months > 1 ? "ები" : ""));
        System.out.println("ანაბრის ვადის ამოწურვის შემდეგ მიღებული თანხა: " + (depositAmount + finalAmount) + " ლარი");


        System.out.println();
        System.out.println("გიორგი ჩქარეულის ტრანზაქციები:");
        account1.printTransactionHistory();
        System.out.println();
        System.out.println("ზვიად თურმანიძის ტრანზაქციები:");
        account2.printTransactionHistory();


    }
}
