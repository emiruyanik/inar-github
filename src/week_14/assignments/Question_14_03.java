package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_03 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            double x = (double) (Math.random() * 100);
            double y = (double) (Math.random() * 100);
            points.add(i, new Point(x, y));
        }
        Collections.sort(points);
        System.out.println("Points sorted by x coordinates:");
        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
        CompareY compareY=new CompareY();
        Collections.sort(points,compareY);
        System.out.println("Points sorted by y-coordinates:");
        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
