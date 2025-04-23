import java.util.Random;

public class BookAdvisor extends Employee {
    private double rating;
    private Library library;

    public BookAdvisor(String firstName, String lastName, int id, double rating, Library library) {
        super(firstName, lastName, id);
        this.rating = rating;
        this.library = library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book recommendBook() {
        Random random = new Random();
        int index = random.nextInt(library.getBooks().length);
        return library.getBooks()[index];
    }

    public double getRating() {
        return rating;
    }
}
