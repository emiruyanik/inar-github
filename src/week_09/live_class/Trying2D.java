package week_09.live_class;

import java.awt.geom.Point2D;

public class Trying2D {
    public static void main(String[] args) {
        Point2D point1=new Point2D.Double(3,5);
        System.out.println(point1.distance(3,-4));

        Point2D point2=new Point2D.Double(-1,4);
        System.out.println(point1.distance(point2));

        System.out.println(point2.getX());
        System.out.println(point2.toString());
    }
}

