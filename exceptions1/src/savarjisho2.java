import java.util.Scanner;

public class savarjisho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ რიცხვი: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("გაყოფის შედეგი: " + result);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: გთხოვთ შეიყვანოთ მხოლოდ რიცხვი!");
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: ნულზე გაყოფა შეუძლებელია!");
        }

        scanner.close();
    }
}
