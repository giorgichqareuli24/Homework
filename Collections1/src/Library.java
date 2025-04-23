import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookDetails = line.split(" ");
                String bookName = bookDetails[0];
                int pages = Integer.parseInt(bookDetails[1]);
                Book book = new Book(bookName, pages);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("HarryPotter 223\n");
            writer.write("Bible 1600\n");
            writer.write("GreatGatsby 190\n");
            writer.write("DonQuixote 1000\n");
            writer.write("LordOfRings 1216\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
