public class Circle extends Shape {
    private double radius;

    public Circle() {
        super("Circle");
        this.radius = 0;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Shape: " + name + ", Radius: " + radius + ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}
