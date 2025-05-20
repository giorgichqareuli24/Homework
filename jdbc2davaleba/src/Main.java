import service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- მენიუ ---");
            System.out.println("1. რეგისტრაცია");
            System.out.println("2. ავტორიზაცია");
            System.out.println("0. გასვლა");
            System.out.print("აირჩიეთ: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("დახურვა...");
                break;
            }

            System.out.print("მომხმარებლის სახელი: ");
            String username = scanner.nextLine();

            System.out.print("პაროლი: ");
            String password = scanner.nextLine();

            if (choice == 1) {
                System.out.print("სახელი: ");
                String firstName = scanner.nextLine();

                System.out.print("გვარი: ");
                String lastName = scanner.nextLine();

                userService.register(username, password, firstName, lastName);
            } else if (choice == 2) {
                userService.login(username, password);
            } else {
                System.out.println("არასწორი არჩევანი!");
            }
        }

        scanner.close();
    }
}























//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}