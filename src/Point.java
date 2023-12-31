public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point destination) {
        // Implement the distance calculation here
        return Math.sqrt(Math.pow(destination.x - this.x, 2) + Math.pow(destination.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

