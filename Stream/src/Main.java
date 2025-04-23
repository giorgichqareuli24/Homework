import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
//        1 სავარჯიშო
        List<Integer> numbers = Arrays.asList(3, 5, 10, 15, 20, 8, 25, 30);
//        int sum = numbers.stream()
//                .filter(n -> n >= 10)
//                .map(n -> n * n)
//                .reduce(0, Integer::sum);
//
//        System.out.println("შედეგი: " + sum);





//        2 სავარჯიშო
//        List<String> words = Arrays.asList("Jeep", "Bmw", "Lexus", "Bugatti", "Jaguar", "Ferrari", "Jetta");
//
//        List<String> filteredWords = words.stream()
//                .filter(word -> word.startsWith("J"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println("შედეგი: " + filteredWords);





//        3 სავარჯიშო
//        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Mango", "Peach", "Grapes", "Orange");
//
//        Set<String> sortedWords = words.stream()
//                .sorted()
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        System.out.println("სეტში დალაგებული და შენახული სიტყვები: " + sortedWords);





//        4 სავარჯიშო
//        List<Human> humans = Arrays.asList(
//                new Human("Giorgi", 16),
//                new Human("Vaxo", 14),
//                new Human("Levani", 17),
//                new Human("Mari", 15),
//                new Human("Zviadi", 16)
//        );
//
//        boolean Levani = humans.stream()
//                .filter(h -> h.getAge() >= 15)
//                .anyMatch(h -> h.getName().equals("Levani"));
//
//        System.out.println("არსებობს თუ არა 15 წელს გადაცილებული ადამიანი სახელად Levani: " + Levani);





//        5 სავარჯიშო
//        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 4, 2, 1, 6);
//
//        TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
//
//        Integer secondSmallest = sortedNumbers.stream()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//
//        Integer secondLargest = sortedNumbers.descendingSet().stream()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("მეორე ყველაზე მცირე რიცხვი: " + secondSmallest);
//        System.out.println("მეორე ყველაზე დიდი რიცხვი: " + secondLargest);

    }
}