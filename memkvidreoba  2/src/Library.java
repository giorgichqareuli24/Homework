public class Library {
    private String name;
    private Employee[] employees;
    private Book[] books;

    public Library(String name, Employee[] employees, Book[] books) {
        this.name = name;
        this.employees = employees;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Book[] getBooks() {
        return books;
    }

    public void printLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getFullName());
        }
    }
}
