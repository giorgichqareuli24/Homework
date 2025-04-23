import java.util.*;

public class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> subjects;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public HashMap<String, ArrayList<Integer>> getSubjects() {
        return subjects;
    }

    public void addScores(String subject, List<Integer> scores) {
        subjects.put(subject, new ArrayList<>(scores));
    }
    public double getAverageScore() {
        double total = 0;
        int count = 0;

        for (ArrayList<Integer> scores : subjects.values()) {
            for (int score : scores) {
                total += score;
                count++;
            }
        }

        return count == 0 ? 0 : total / count;
    }

    @Override
    public int compareTo(Student other) {
        double avg1 = this.getAverageScore();
        double avg2 = other.getAverageScore();
        return Double.compare(avg1, avg2);
    }
}

