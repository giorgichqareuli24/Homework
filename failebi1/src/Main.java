import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "first file";
        String text = "შიგან ასრე გავერიე, გნოლის ჯოგსა ვითა ქორი,\n" +
                "კაცი კაცსა შემოვსტყორცნი, ცხენ-კაცისა დავდგი გორი;\n" +
                "კაცი, ჩემგან განატყორცნი ბრუნავს ვითა ტანაჯორი,\n" +
                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.";


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("ტექსტი წარმატებით ჩაიწერა ფაილში!");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის ჩაწერისას: " + e.getMessage());
            return;
        }


        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("საერთო სიტყვების რაოდენობა ფაილში: " + wordCount);
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის წაკითხვისას: " + e.getMessage());
        }



        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ სიტყვა, რომლის მოძებნაც გსურთ: ");
        String wordToSearch = scanner.nextLine();

        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToSearch)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის წაკითხვისას: " + e.getMessage());
            return;
        }


        if (found) {
            System.out.println("ფაილში არის სიტყვა: " + wordToSearch);
        } else {
            System.out.println("ფაილში არ არის სიტყვა: " + wordToSearch);
        }

        scanner.close();
    }
}
