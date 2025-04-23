public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle(5);
//        System.out.println("Circle Area: " + circle.getArea());
//        System.out.println("Circle Perimeter: " + circle.getPerimeter());
//
//        Rectangle rectangle = new Rectangle(4, 3);
//        System.out.println("Rectangle Area: " + rectangle.getArea());
//        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
//
//        Triangle triangle = new Triangle(3, 4, 5);
//        System.out.println("Triangle Area: " + triangle.getArea());
//        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());








        Milk milk1 = new Milk(2.5, "2024-12-30", 1.0);
        Milk milk2 = new Milk(3.0, "2024-12-25", 1.5);
        Cake cake1 = new Cake(15.0, "2024-12-20", 0.5);
        Sandwich sandwich1 = new Sandwich(5.0, "2024-12-15", 25.0);

        Product[] products = {milk1, milk2, cake1, sandwich1};

        Store store = new Store(products);

        System.out.println("Store Products:");
        for (Product product : store.getProducts()) {
            System.out.println("Price: " + product.getPrice() + ", Expiry Date: " + product.getExpiryDate());
            printProductDetails(product);
            System.out.println();
        }
    }

    public static void printProductDetails(Product product) {
        if (product.getClass() == Milk.class) {
            Milk milk = (Milk) product;
            System.out.println("Volume: " + milk.getVolume() + " liters");
        } else if (product.getClass() == Cake.class) {
            Cake cake = (Cake) product;
            System.out.println("Weight: " + cake.getWeight() + " kg");
        } else if (product.getClass() == Sandwich.class) {
            Sandwich sandwich = (Sandwich) product;
            System.out.println("Length: " + sandwich.getLength() + " cm");
        }

    }
}