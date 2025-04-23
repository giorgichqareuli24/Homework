import java.io.*;

public class DeserializeCountries {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("countries.txt"))) {
            Country[] countries = (Country[]) ois.readObject();

            System.out.println("Countries from file:");
            for (Country country : countries) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
