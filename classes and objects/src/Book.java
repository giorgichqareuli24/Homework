public class Book {
    String title;
    String author;
    int pageCount;


    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pageCount = 0;
    }

    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}
