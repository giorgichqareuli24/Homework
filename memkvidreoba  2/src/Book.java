public abstract class Book {
    private String title;
    private int pages;
    private String author;
    private boolean isHardCover;

    public Book(String title, int pages, String author, boolean isHardCover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isHardCover = isHardCover;
    }

    public String getTitle() {
        return title;
    }

    public void read() {
        System.out.println("I'm reading " + title);
    }
}
