import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human person1 = new Human("ზვიადი", "თურმანიძე", 25);
        Human person2 = new Human("ანა", "ბერიძე", 23);

        person1.walk();
        person1.hangOut(person2);


        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანე სახელი, გვარი და ასაკი:");

        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

        Person person = new Person(firstName, lastName, age);

        person.introduce();
        person.printAdultStatus();

        scanner.close();
    }
}