public class Main {
    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast("თბილისი", 10.5, 30, false, true, true);
        forecast.printForecast();
        System.out.println("სასეირნოდ წასვლა რეკომენდირებულია: " + (forecast.recommendForWalk() ? "კი" : "არა"));



        System.out.println("----------------------------");



        Student[] students = new Student[5];
        students[0] = new Student("ნიკა", "პეტრიაშვილი", 20, 1, 85.5);
        students[1] = new Student("გიორგი", "ჩქარეული", 22, 3, 97.0);
        students[2] = new Student("ზვიად", "თურმანიძე", 19, 1, 78.3);
        students[3] = new Student("მარიამ", "ჯაფარიძე", 21, 2, 88.4);
        students[4] = new Student("ლაშა", "ტალახაძე", 19, 4, 91.7);

        for (Student student : students) {
            student.printStudentInfo();
            System.out.println();
        }


        String topStudent = findTopStudent(students);
        System.out.println("ყველაზე მაღალი ქულის მქონე სტუდენტი: " + topStudent);
    }





    public static String findTopStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return "სტუდენტების სია ცარიელია.";
        }

        Student topStudent = students[0];
        for (Student student : students) {
            if (student.getAverageGrade() > topStudent.getAverageGrade()) {
                topStudent = student;
            }
        }
        return topStudent.getFirstName() + " " + topStudent.getLastName();





    }
}