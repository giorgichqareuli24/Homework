import java.util.Comparator;

public class BasketballPlayerComparator {
    public static class ByRatingDescending implements Comparator<BasketballPlayer> {
        @Override
        public int compare(BasketballPlayer p1, BasketballPlayer p2) {
            return Double.compare(p2.getRating(), p1.getRating());
        }
    }

    public static class ByRatingAscending implements Comparator<BasketballPlayer> {
        @Override
        public int compare(BasketballPlayer p1, BasketballPlayer p2) {
            return Double.compare(p1.getRating(), p2.getRating());
        }
    }
}
