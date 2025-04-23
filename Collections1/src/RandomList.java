import java.util.ArrayList;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        while (true) {
            int num = rand.nextInt(51);
            numbers.add(num);
            if (num == 40) {
                break;
            }
        }

        System.out.println("სიის ზომა: " + numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        numbers.removeIf(num -> num % 2 == 0);

        System.out.println("სია ლუწი რიცხვების წაშლის შემდეგ:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}