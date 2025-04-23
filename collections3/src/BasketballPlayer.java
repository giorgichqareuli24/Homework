public class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int points;
    private int rebounds;
    private int blocks;
    private int assists;
    private int turnovers;

    public BasketballPlayer(String firstName, String lastName, int points, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }

    public double calculateRating() {
        return (points * 1) + (rebounds * 1) + (blocks * 2) + (assists * 1.5) + (turnovers * -2);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - რეიტინგი: " + calculateRating();
    }

    public double getRating() {
        return calculateRating();
    }
}
