import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.createFile("books.txt");
        library.populateList("books.txt");

        ArrayList<Book> books = library.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
