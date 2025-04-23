public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void perimeter() {
        System.out.println("Perimeter: " + 2 * (length + width));
    }

    public void area() {
        System.out.println("Area: " + (length * width));
    }

    public void diagonal() {
        System.out.println("Diagonal: " + Math.sqrt(length * length + width * width));
    }


    public void isSquare() {
        if (length == width) {
            System.out.println("This is a square.");
        } else {
            System.out.println("This is not a square.");
        }
    }

    public void displayRectangleInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        perimeter();
        area();
        diagonal();
        isSquare();
    }
}

