import models.Point;
import models.Shape;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        // Reading points from the file and adding them to the Shape

        while(sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);// Adding the point to the Shape
        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());
        System.out.println(shape.getAverageSide());
    }
}