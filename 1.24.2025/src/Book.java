public class Book {
    private String title;
    private int pages;
    private String genre;
    private Writer author;

    public Book(String title, int pages, String genre, Writer author) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public Writer getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pages == book.pages &&
                title.equals(book.title) &&
                genre.equals(book.genre) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return 31 * title.hashCode() + pages + genre.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }
}
