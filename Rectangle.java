public class Rectangle extends Shape {
    private double width, height;

    public Rectangle() {
        super("Rectangle");
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Shape: " + name + ", Width: " + width + ", Height: " + height + ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}
