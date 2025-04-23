import java.io.*;
import java.util.Scanner;

public class SerializeCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of country #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the population of " + name + ": ");
            long population = scanner.nextLong();
            System.out.print("Enter the area of " + name + " (in km²): ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("countries.txt"))) {
            oos.writeObject(countries);
            System.out.println("Countries have been serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

