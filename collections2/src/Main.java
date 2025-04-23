import java.util.Arrays;
import java.util.HashMap;
import java.util.*;



public class Main {
    public static void main(String[] args) {
//        1 სავარჯიშო
        String[] words = {"Mercedes", "Opel", "BMW", "Mercedes", "Opel", "Skoda"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String key : wordCount.keySet()) {
            System.out.println(key + " - " + wordCount.get(key));
        }






//        2,3,4 სავარჯიშო
        Student student1 = new Student("1", "ვახო", "ჩაბაკაური");
        student1.addScores("ქართული", Arrays.asList(1, 4, 7, 8, 9, 10, 10, 10, 2));
        student1.addScores("მათემატიკა", Arrays.asList(9, 8, 9, 8, 7, 7, 8, 9, 8, 10));

        Student student2 = new Student("2", "ზიკო", "თურმანიძე");
        student2.addScores("ქართული", Arrays.asList(5, 7, 8, 9));
        student2.addScores("მათემატიკა", Arrays.asList(6, 7, 8, 9));

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Collections.sort(students);

        System.out.println("დალაგება საშუალო ქულების მიხედვით:");
        System.out.println("----------------------");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - საშუალო ქულა: " + student.getAverageScore());
            System.out.println("საშუალო ქულები საგნებში:");
            for (Map.Entry<String, ArrayList<Integer>> entry : student.getSubjects().entrySet()) {
                String subject = entry.getKey();
                ArrayList<Integer> scores = entry.getValue();
                double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                System.out.println(subject + " - საშუალო ქულა: " + average);
            }
        }


        students.sort(new StudentLastNameComparator());
        System.out.println("\nდალაგება გვარების მიხედვით:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}