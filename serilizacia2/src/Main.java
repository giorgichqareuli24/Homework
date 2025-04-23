import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<PhoneContact> contacts = Data.loadContacts();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    Data.saveContacts(contacts);
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nPhone Book Menu:");
        System.out.println("1. Add contact");
        System.out.println("2. Delete contact");
        System.out.println("3. Edit contact");
        System.out.println("4. View contacts");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addContact() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        PhoneContact contact = new PhoneContact(firstName, lastName, phoneNumber, email);
        contacts.add(contact);
        Data.saveContacts(contacts);
        System.out.println("Contact added successfully.");
    }

    private static void deleteContact() {
        System.out.print("Enter the index of contact to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            Data.saveContacts(contacts);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void editContact() {
        System.out.print("Enter the index of contact to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < contacts.size()) {
            PhoneContact contact = contacts.get(index);
            System.out.print("Enter new first name (leave blank to keep unchanged): ");
            String firstName = scanner.nextLine();
            if (!firstName.isEmpty()) contact.setFirstName(firstName);

            System.out.print("Enter new last name (leave blank to keep unchanged): ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) contact.setLastName(lastName);

            System.out.print("Enter new phone number (leave blank to keep unchanged): ");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isEmpty()) contact.setPhoneNumber(phoneNumber);

            System.out.print("Enter new email (leave blank to keep unchanged): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) contact.setEmail(email);

            Data.saveContacts(contacts);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + ". " + contacts.get(i));
            }
        }
    }
}
