public class Sandwich extends Product {
    private double length;

    public Sandwich(double price, String expiryDate, double length) {
        super(price, expiryDate);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
