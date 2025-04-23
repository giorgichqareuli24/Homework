import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1 ნომერი
        System.out.println("შეიყვანეთ სტრიქონი ციფრების დასათვლელად:");
        String input = scanner.nextLine();

        int digitCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        System.out.println("სტრიქონში ციფრების რაოდენობა: " + digitCount);


//        2 ნომერი
//        System.out.println("შეიყვანეთ სტრიქონი წინადადებების დასათვლელად:");
//        String input = scanner.nextLine().trim();
//
//        String[] sentences = input.split("[.?!;]+");
//
//        int sentenceCount = 0;
//        for (String sentence : sentences) {
//            if (!sentence.trim().isEmpty()) {
//                sentenceCount++;
//            }
//        }

//        System.out.println("სტრიქონში წინადადებების რაოდენობა: " + sentenceCount);




//        3 ნომერი
//        System.out.println("შეიყვანეთ სტრიქონი პალინდრომის შესამოწმებლად:");
//        String input = scanner.nextLine();
//
//        String cleanInput = input.replaceAll("[^a-zA-Z0-9ა-ჰ]", "").toLowerCase();
//        String reversed = new StringBuilder(cleanInput).reverse().toString();
//
//        if (cleanInput.equals(reversed)) {
//            System.out.println("სტრიქონი პალინდრომია.");
//        } else {
//            System.out.println("სტრიქონი არ არის პალინდრომი.");
//        }




//        4 ნომერი
//        System.out.println("შეიყვანეთ s1:");
//        String s1 = scanner.nextLine();
//        System.out.println("შეიყვანეთ s2:");
//        String s2 = scanner.nextLine();
//
//        if (s1.contains(s2)) {
//            System.out.println("s2 არის s1-ის ქვესტრიქონი.");
//        } else {
//            System.out.println("s2 არ არის s1-ის ქვესტრიქონი.");
//        }



//        5 ნომერი
//        System.out.println("შეიყვანეთ სტრიქონი ბოლო სიმბოლოს შესამოწმებლად:");
//        String input = scanner.nextLine();
//
//        char lastChar = input.charAt(input.length() - 1);
//        if ("aeiouAEIOUაეიოუ".indexOf(lastChar) >= 0) {
//            System.out.println("სტრიქონი მთავრდება ხმოვნით.");
//        } else {
//            System.out.println("სტრიქონი მთავრდება თანხმოვნით.");
//        }



//        6 ნომერი
//        System.out.println("შეიყვანეთ ნიტას ჩარევის შედეგად მიღებული სიტყვა:");
//        String modifiedWord = scanner.nextLine();
//
//        StringBuilder originalWord = new StringBuilder();
//        for (int i = 0; i < modifiedWord.length(); i++) {
//            if (i == modifiedWord.length() - 1 || modifiedWord.charAt(i) != modifiedWord.charAt(i + 1)) {
//                originalWord.append(modifiedWord.charAt(i));
//            }
//        }
//        System.out.println("თავდაპირველი სიტყვა: " + originalWord);


//        7 ნომერი
//        System.out.println("შეიყვაეთ სიტყვა უზარმაზარის შესამოწმებლად:");
//        String word = scanner.nextLine();
//
//        if (word.length() > 10) {
//            String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
//            System.out.println("სიტყვა უზარმაზარია. მისი აბრევიატურაა: " + abbreviation);
//        } else {
//            System.out.println("სიტყვა არ არის უზარმაზარი.");
//        }
    }
}