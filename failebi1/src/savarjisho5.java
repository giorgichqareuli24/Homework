import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class savarjisho5 {
    public static void main(String[] args) {
        String firstFileName = "first file";
        String secondFileName = "second file";
        String outputFileName = "merged file";

        try (BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFileName));
             BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            writer.write("პირველი ფაილი\n");
            String line;
            while ((line = firstFileReader.readLine()) != null) {
                writer.write(line + "\n");
            }

            writer.write("\n");

            writer.write("მეორე ფაილი\n");
            while ((line = secondFileReader.readLine()) != null) {
                writer.write(line + "\n"); 
            }

            System.out.println("ფაილები გაერთიანდა და შენახულია " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
