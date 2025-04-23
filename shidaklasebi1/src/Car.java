class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;
    private Engine engine;

    public Car(String manufacturer, String model, String licensePlate, String fuelType, int cylinderCount, int mileageResource) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
        this.engine = new Engine(fuelType, cylinderCount, mileageResource);
    }

    class Engine {
        private String fuelType;
        private int cylinderCount;
        private int mileageResource;

        public Engine(String fuelType, int cylinderCount, int mileageResource) {
            this.fuelType = fuelType;
            this.cylinderCount = cylinderCount;
            this.mileageResource = mileageResource;
        }

        public int getMileageResource() {
            return mileageResource;
        }

        public void printInfo() {
            System.out.println("საწვავის ტიპი: " + fuelType);
            System.out.println("ცილინდრები: " + cylinderCount);
            System.out.println("გარბენის რესურსი: " + mileageResource + " კმ");
        }
    }

    public int getMileageResource() {
        return engine.getMileageResource();
    }

    public void printInfo() {
        System.out.println("მწარმოებელი: " + manufacturer);
        System.out.println("მოდელი: " + model);
        System.out.println("სანომრე ნიშანი: " + licensePlate);
        engine.printInfo();
    }
}
