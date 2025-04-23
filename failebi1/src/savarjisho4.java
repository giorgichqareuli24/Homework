import java.io.FileWriter;
import java.io.IOException;

public class savarjisho4 {
    public static void main(String[] args) {
        String text = "Assure polite his real and other figures though. Day age advantages\n" +
                "and sufficient eating expression traveling. Of on am father by agreed\n" +
                "supply rather either. Own handsome delicate property mistresses her\n" +
                "end appetite. Mean are sons too sold nor said. Son share three men\n" +
                "power by you. Now merits wonder effect garret own.";

        String upperCaseText = text.toUpperCase();

        try (FileWriter writer = new FileWriter("second file")) {
            writer.write(upperCaseText);
            System.out.println("ფაილი წარმატებით შეიქმნა!");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის შექმნისას: " + e.getMessage());
        }
    }
}
