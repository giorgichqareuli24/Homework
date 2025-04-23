import java.util.Scanner;

public class MultiplesSum {

    public static int calculateSum(int a, int b, int k) {
        if (a > b) {
            return 0;
        }
        if (a % k == 0) {
            return a + calculateSum(a + 1, b, k);
        }
        return calculateSum(a + 1, b, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ a: ");
        int a = scanner.nextInt();

        System.out.print("შეიყვანეთ b: ");
        int b = scanner.nextInt();

        System.out.print("შეიყვანეთ k: ");
        int k = scanner.nextInt();

        int sum = calculateSum(a, b, k);
        System.out.println("k-ს ჯერადების ჯამი [" + a + ", " + b + "] შუალედში არის: " + sum);

        scanner.close();
    }
}