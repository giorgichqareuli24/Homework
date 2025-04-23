public class FantasyBook extends Book {
    private String country;

    public FantasyBook(String title, int pages, String author, boolean isHardCover, String country) {
        super(title, pages, author, isHardCover);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

