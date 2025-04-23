import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1) b
//        2) a
//        3) a, b, d
//        4) c
//        5) a, c
//        6) b
//        7) c
//        8) b
//        9) b
//        10) c
//        11) c
//        12) b
//        13) a, b, c
//        14) b, d
//        15) c



        List<Student> students = new ArrayList<>();
        String inputFile = "students.txt";
        String outputFile = "students.ser";

        File file = new File(inputFile);
        if (!file.exists()) {
            createTextFile(inputFile);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 6) {
                    try {
                        int id = Integer.parseInt(parts[0].trim());
                        String firstName = parts[1].trim();
                        String lastName = parts[2].trim();
                        int year = Integer.parseInt(parts[3].trim());
                        double grade = Double.parseDouble(parts[4].trim());
                        List<String> subjects = Arrays.asList(parts[5].trim().split(" "));

                        Student student = new Student(id, firstName, lastName, year, grade, subjects);
                        students.add(student);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format in line: " + line);
                    }
                } else {
                    System.err.println("Invalid data format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            oos.writeObject(students);
            System.out.println("Data serialized to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error serializing the data: " + e.getMessage());
            return;
        }

        List<Student> deserializedStudents = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFile))) {
            deserializedStudents = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing the data: " + e.getMessage());
            return;
        }

        System.out.println("Deserialized students:");
        for (Student student : deserializedStudents) {
            System.out.println(student);
        }
    }

    private static void createTextFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("101,John,Doe,2,8.5,Math English History\n");
            writer.write("102,Jane,Smith,4,9.0,Physics Chemistry Biology\n");
            writer.write("103,Michael,Brown,1,75.0,History Geography\n");
            writer.write("104,Emily,White,4,80.0,Math ComputerScience Economics\n");
            writer.write("105,David,Lee,2,85.0,Physics Math Statistics\n");
            writer.write("106,Sarah,Johnson,3,90.0,English History Art\n");
            writer.write("107,Robert,Garcia,1,78.0,Math Physics\n");
            writer.write("108,Linda,Martinez,4,82.5,Chemistry Biology English\n");
            writer.write("109,William,Rodriguez,2,87.0,Geography History PoliticalScience\n");
            writer.write("110,Barbara,Hernandez,3,91.5,Math Economics ComputerScience\n");
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }

        

    }
}