import java.io.*;
import java.util.*;

public class StudentSerialization {
        public static List<Student> readStudentsFromFile(String fileName) {
            List<Student> students = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    int id = Integer.parseInt(parts[0].trim());
                    String firstName = parts[1].trim();
                    String lastName = parts[2].trim();
                    int year = Integer.parseInt(parts[3].trim());
                    double avgScore = Double.parseDouble(parts[4].trim());
                    List<String> subjects = Arrays.asList(parts[5].trim().split(" "));
                    students.add(new Student(id, firstName, lastName, year, avgScore, subjects));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return students;
        }

        public static void serializeStudents(List<Student> students, String fileName) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                oos.writeObject(students);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static List<Student> deserializeStudents(String fileName) {
            List<Student> students = null;
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
                students = (List<Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return students;
        }

        public static void main(String[] args) {

            List<Student> students = readStudentsFromFile("students.txt");

            serializeStudents(students, "students.ser");

            List<Student> deserializedStudents = deserializeStudents("students.ser");

            if (deserializedStudents != null) {
                deserializedStudents.sort(Student.compareByAvgScore);

                for (Student student : deserializedStudents) {
                    System.out.println(student);
                }
            }
        }
    }


