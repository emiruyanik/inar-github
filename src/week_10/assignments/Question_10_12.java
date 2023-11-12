package week_10.assignments;

import java.util.Scanner;

public class Question_10_12 {
    public static void main(String[] args) {
        Triangle2D triangle2D = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Perimeter?" + triangle2D.getPerimeter());
        System.out.println("Area?" + triangle2D.getArea());
        System.out.println("t1 contains(3,3)?" + triangle2D.contains(3, 3));
        System.out.println(triangle2D.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
    }
}
