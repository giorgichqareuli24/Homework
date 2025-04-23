import java.util.Scanner;

public class savarjisho3 {

    public static void checkForNegativeNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("უარყოფითი რიცხვი აღმოჩენილია!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("შეიყვანეთ რიცხვი: ");
                int input = scanner.nextInt();

                checkForNegativeNumber(input);

                System.out.println("შეყვანილი რიცხვი: " + input);

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("შეიყვანეთ სწორი რიცხვი.");
                scanner.next();
            }
        }
    }
}
