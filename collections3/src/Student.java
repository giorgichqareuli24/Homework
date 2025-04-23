import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private ArrayList<Integer> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", DateOfBirth: " + birthDate + ", Avg Grade: " + getAverageGrade();
    }
}
