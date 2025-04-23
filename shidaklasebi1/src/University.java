class University {
    private String name;
    private boolean isPublic;
    private int facultyCount;

    public University(String name, boolean isPublic, int facultyCount) {
        this.name = name;
        this.isPublic = isPublic;
        this.facultyCount = facultyCount;
    }

    public void printInfo() {
        System.out.println("უნივერსიტეტი: " + name);
        System.out.println("საჯარო: " + (isPublic ? "Yes" : "No"));
        System.out.println("ფაკულტეტების რაოდენობა: " + facultyCount);
    }

    class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String personalId;
        private double gpa;
        private int course;

        public Student(String firstName, String lastName, int age, String personalId, double gpa, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalId = personalId;
            this.gpa = gpa;
            this.course = course;
        }

        public void printInfo() {
            System.out.println("სტუდენტის სახელი: " + firstName + " " + lastName);
            System.out.println("ასაკი: " + age);
            System.out.println("პირადი ნომერი: " + personalId);
            System.out.println("საშუალო ქულა: " + gpa);
            System.out.println("კურსი: " + course);
        }
    }
}


