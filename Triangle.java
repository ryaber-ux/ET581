import static java.lang.Math.*;

public class Triangle extends Shape {
    private double a, b;
    private int angle;

    public Triangle() {
        super("Triangle");
        this.a = 0;
        this.b = 0;
        this.angle = 0;
    }

    public Triangle(double a, double b, int angle) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public double area() {
        return a * b * sin(toRadians(angle)) / 2;
    }

    public double perimeter() {
        double c = sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(toRadians(angle)));
        return a + b + c;
    }

    public void display() {
        System.out.println("Shape: " + name + ", Side A: " + a + ", Side B: " + b + ", Angle between A and B: " + angle + ".0" +
                ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}
