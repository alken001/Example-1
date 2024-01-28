package models;

public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    // getters and setters
    public void setPointX(double x){
        this.x = x;
    }
    public void setPointY(double y){
        this.y = y;
    }
    public void setPoints(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double[] getPoints(){
        return new double[]{x, y};
    }
    // Override toString method to represent Point's coordinates as a string
    @Override public String toString(){
        return x + " : " + y;
    }
    public double getDistance(Point target){
        // using mathematics formula
        return Math.sqrt(Math.pow((this.x - target.getX()), 2) + Math.pow((this.y - target.getY()), 2));
    }
}