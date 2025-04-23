import java.util.Scanner;

public class savarjisho4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("შეიყვანეთ რიცხვი: ");
            double number = scanner.nextDouble();

            double result = SquareRootCalculator.calculateSquareRoot(number);
            System.out.println("კვადრატული ფესვი: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("შეცდომა: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("შეიყვანეთ სწორი რიცხვი.");
        } finally {
            scanner.close();
        }
    }

    public static class SquareRootCalculator {
        public static double calculateSquareRoot(double number) throws IllegalArgumentException {
            if (number < 0) {
                throw new IllegalArgumentException("უარყოფითი რიცხვისთვის კვადრატული ფესვი ვერ ითვლება!");
            }
            return Math.sqrt(number);
        }
    }
}
