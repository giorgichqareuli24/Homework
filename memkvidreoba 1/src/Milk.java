public class Milk extends Product {
    private double volume;

    public Milk(double price, String expiryDate, double volume) {
        super(price, expiryDate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
