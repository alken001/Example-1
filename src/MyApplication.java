import java.util.ArrayList;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        // Create 10 random points and form a shape
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double x = Math.random() * 10;
            double y = Math.random() * 10;
            points.add(new Point(x, y));
        }

        Shape shape = new Shape(points);

        // Test the methods
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
