public class Cake extends Product {
    private double weight;

    public Cake(double price, String expiryDate, double weight) {
        super(price, expiryDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

