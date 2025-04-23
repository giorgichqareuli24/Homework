import java.lang.Math;

public class QuadraticEquation {
    private double a, b, c;
    private Double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            x1 = x2 = null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        QuadraticEquation other = (QuadraticEquation) obj;

        if ((x1 == null && other.x1 != null) || (x1 != null && !x1.equals(other.x1))) return false;
        if ((x2 == null && other.x2 != null) || (x2 != null && !x2.equals(other.x2))) return false;

        return true;
    }

    @Override
    public String toString() {
        if (x1 == null || x2 == null) {
            return "Quadratic equation: " + a + "x^2 + " + b + "x + " + c + " has no real solutions.";
        } else {
            return "Quadratic equation: " + a + "x^2 + " + b + "x + " + c + " has solutions x1 = " + x1 + " and x2 = " + x2;
        }
    }
}
