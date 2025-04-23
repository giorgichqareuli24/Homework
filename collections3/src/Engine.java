public class Engine {
    private String fuelType;
    private int cylinderCount;
    private double capacity;

    public Engine(String fuelType, int cylinderCount, double capacity) {
        this.fuelType = fuelType;
        this.cylinderCount = cylinderCount;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return fuelType + ", " + cylinderCount + " ცილინდრი, " + capacity + " ლიტრი";
    }
}
