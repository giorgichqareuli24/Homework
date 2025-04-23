public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    private double averageGrade;

    public Student(String firstName, String lastName, int age, int course, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.averageGrade = averageGrade;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("ასაკი უნდა იყოს 0-ზე მეტი");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("კურსი უნდა იყოს 1-დან 4-მდე.");
        }
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0 && averageGrade <= 100) {
            this.averageGrade = averageGrade;
        } else {
            System.out.println("საშუალო ქულა უნდა იყოს 0-დან 100-მდე.");
        }
    }

    public void printStudentInfo() {
        System.out.println("სტუდენტი: " + firstName + " " + lastName);
        System.out.println("ასაკი: " + age);
        System.out.println("კურსი: " + course);
        System.out.println("საშუალო ქულა: " + averageGrade);
    }

}
