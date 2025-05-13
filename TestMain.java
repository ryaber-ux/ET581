public class TestMain {
    public static void main(String[] args) {
        ShapeList a = new ShapeList();
        a.addShape(new Triangle(2, 3, 90));
        a.addShape(new Rectangle(5, 6));
        a.addShape(new Circle(3.5));
        
        System.out.println("----------------------------------");
        a.display();
        System.out.println("Max area: " + a.maxArea());
        System.out.println("Max perimeter: " + a.maxPerimeter());
        System.out.println("----------------------------------");

        a.addShape(new Circle(5));
        a.addShape(new Rectangle(9, 8));
        a.addShape(new Triangle(10, 11, 60));
        a.display();
        System.out.println("Max area: " + a.maxArea());
        System.out.println("Max perimeter: " + a.maxPerimeter());
        System.out.println("----------------------------------");

        a.removeShape();
        a.removeShape();
        a.display();
        System.out.println("----------------------------------");
    }
}
