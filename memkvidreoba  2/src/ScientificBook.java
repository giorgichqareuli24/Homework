public class ScientificBook extends Book {
    private String scienceField;

    public ScientificBook(String title, int pages, String author, boolean isHardCover, String scienceField) {
        super(title, pages, author, isHardCover);
        this.scienceField = scienceField;
    }

    public String getScienceField() {
        return scienceField;
    }
}
