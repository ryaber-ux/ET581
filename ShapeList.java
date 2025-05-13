import java.util.*;

public class ShapeList {
    private List<Shape> shapes;

    public ShapeList() {
        shapes = new ArrayList<>();
    }
    public void addShape(Shape s) {
        shapes.add(s);
    }
    public void removeShape() {
        if (!shapes.isEmpty()) {
            shapes.remove(0);
        }
    }
    public void display() {
        for (Shape s : shapes) {
            s.display();
        }
    }
    public double maxArea() {
        double max = 0;
        for (Shape s : shapes) {
            max = Math.max(max, s.area());
        }
        return max;
    }

    public double maxPerimeter() {
        double max = 0;
        for (Shape s : shapes) {
            max = Math.max(max, s.perimeter());
        }
        return max;
    }
}
