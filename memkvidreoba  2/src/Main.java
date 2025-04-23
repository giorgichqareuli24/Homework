public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new BookOrganizer("Alice", "Smith", 1),
                new BookIssuer("Bob", "Johnson", 2, "9:00 AM", "5:00 PM"),
                new SilenceController("Charlie", "Brown", 3, 8.0),
                new BookAdvisor("David", "Williams", 4, 4.8, null)
        };

        Book[] books = new Book[]{
                new AdventureBook("The Lost World", 300, "Arthur Conan Doyle", true),
                new ScientificBook("A Brief History of Time", 250, "Stephen Hawking", true, "Physics"),
                new FantasyBook("The Hobbit", 310, "J.R.R. Tolkien", true, "Middle Earth")
        };

        Library library = new Library("City Library", employees, books);

        BookAdvisor advisor = (BookAdvisor) employees[3];
        advisor.setLibrary(library);

        library.printLibraryInfo();

        Book recommendedBook = advisor.recommendBook();
        System.out.println(advisor.getFullName() + " recommends: " + recommendedBook.getTitle());
    }
}
