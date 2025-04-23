import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

//        int n = 55;
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        double average = sum / n;
//        System.out.println(n + "-ის საშუალო არითმეტიკულია: " + average);




//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ რიცხვი: ");
//        int n = scanner.nextInt();
//
//        System.out.print("ორის ხარისხების ჯამი: ");
//
//        for (int i = 1 << 30; i > 0; i >>= 1) {
//            if (n >= i) {
//                System.out.print(i + " ");
//                n -= i;
//            }
//        }




//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 == 0 || i == 5 || i == 7 || i == 11) {
//                continue;
//            }
//            System.out.println(i);
//        }






//        Scanner scanner = new Scanner(System.in);
//        int binaryNum = scanner.nextInt();
//        int decimalNum = 0;
//        int multiplayer = 1;
//
//        while (binaryNum > 0) {
//            int lastDigit = binaryNum % 10;
//
//            decimalNum += lastDigit * multiplayer;
//            binaryNum /= 10;
//            multiplayer *= 2;
//        }
//        System.out.println(decimalNum);






//        Random random = new Random();
//        int secretNumber = random.nextInt(100) + 1;
//        int userGuess = 0;
//        int attempts = 0;
//
//        System.out.println("ჩაფიქრებულია რიცხვი 1-დან 100-მდე.");
//
//        while (userGuess != secretNumber) {
//            attempts++;
//
//            userGuess = random.nextInt(100) + 1;
//            System.out.println("ვარაუდი: " + userGuess);
//
//            if (userGuess < secretNumber) {
//                System.out.println("ნაკლებია ჩაფიქრებულ რიცხვზე.");
//            } else if (userGuess > secretNumber) {
//                System.out.println("მეტი არის ჩაფიქრებულ რიცხვზე.");
//            } else {
//                System.out.println("თქვენ გამოიცანით ჩაფიქრებული რიცხვი: " + secretNumber);
//                System.out.println("თქვენ გამოცნობა შეძელით " + attempts + " ცდაში ;).");
//            }
//        }

    }
}