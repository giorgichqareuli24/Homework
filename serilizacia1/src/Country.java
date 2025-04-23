import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private long population;
    private double area;

    public Country(String name, long population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + ", area=" + area + '}';
    }
}

