import java.util.Scanner;

public class savarjisho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("შეიყვანეთ პირველი რიცხვი: ");
            int num1 = scanner.nextInt();

            System.out.print("შეიყვანეთ მეორე რიცხვი: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("გაყოფის შედეგი: " + result);

        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია!");
        } catch (Exception e) {
            System.out.println("შეცდომა: შეიყვანეთ მხოლოდ რიცხვები!");
        }

        scanner.close();
    }
}
