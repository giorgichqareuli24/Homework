class Computer {
    private String manufacturerCountry;
    private String brand;
    private double price;
    private boolean hasWarranty;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String manufacturerCountry, String brand, double price, boolean hasWarranty,
                    double screenSize, String resolution, int refreshRate,
                    int ramSlots, String ramType, int fsbSpeed) {
        this.manufacturerCountry = manufacturerCountry;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
        this.monitor = new Monitor(screenSize, resolution, refreshRate);
        this.motherboard = new Motherboard(ramSlots, ramType, fsbSpeed);
    }

    class Monitor {
        private double screenSize;
        private String resolution;
        private int refreshRate;

        public Monitor(double screenSize, String resolution, int refreshRate) {
            this.screenSize = screenSize;
            this.resolution = resolution;
            this.refreshRate = refreshRate;
        }

        public void printInfo() {
            System.out.println("Monitor Size: " + screenSize + " inches");
            System.out.println("Resolution: " + resolution);
            System.out.println("Refresh Rate: " + refreshRate + " Hz");
        }
    }

    class Motherboard {
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public void printInfo() {
            System.out.println("RAM Slots: " + ramSlots);
            System.out.println("RAM Type: " + ramType);
            System.out.println("FSB Speed: " + fsbSpeed + " MHz");
        }
    }

    public void printInfo() {
        System.out.println("Manufacturer Country: " + manufacturerCountry);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Has Warranty: " + (hasWarranty ? "Yes" : "No"));
        monitor.printInfo();
        motherboard.printInfo();
    }
}
