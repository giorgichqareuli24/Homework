public class Car {
    private String brand;
    private String model;
    private int year;
    private String licensePlate;

    public Car(String brand, String model, int year, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    public void printInfo() {
        System.out.println("მანქანის მარკა: " + brand);
        System.out.println("მანქანის მოდელი: " + model);
        System.out.println("გამოშვების წელი: " + year);
        System.out.println("სახელმწიფო ნომერი: " + licensePlate);
        System.out.println();
    }


}

