import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public double perimeter() {
        // Implement the perimeter calculation here
        double per = 0;
        for (int i = 0; i < points.size(); i++) {
            per += points.get(i).distanceTo(points.get((i + 1) % points.size()));
        }
        return per;
    }

    public double longestSide() {
        // Implement finding the longest side here
        double max = 0;
        for (int i = 0; i < points.size(); i++) {
            double current = points.get(i).distanceTo(points.get((i + 1) % points.size()));
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public double averageSide() {
        // Implement calculating the average side length here
        return perimeter() / points.size();
    }
}
