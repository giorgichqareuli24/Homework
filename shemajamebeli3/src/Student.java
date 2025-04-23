import java.io.Serializable;
import java.util.List;
import java.util.*;

public class Student implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double avgScore;
    private List<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double avgScore, List<String> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.avgScore = avgScore;
        this.subjects = new ArrayList<>(subjects);
    }

    @Override
    public String toString() {
        return "Student: {\n" +
                " id: " + id + ",\n" +
                " firstName: " + firstName + ",\n" +
                " lastName: " + lastName + ",\n" +
                " year: " + year + ",\n" +
                " avgScore: " + avgScore + ",\n" +
                " subjects: {\n" + String.join(", ", subjects) + "\n}\n" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, avgScore);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public static Comparator<Student> compareByAvgScore = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.avgScore, s2.avgScore);
        }
    };
}
