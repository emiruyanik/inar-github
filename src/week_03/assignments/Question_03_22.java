package week_03.assignments;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 10;

        System.out.println("Enter a point with two coordinates");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distancToCenter = Math.sqrt((x * x) + (y * y));

        System.out.println((distancToCenter < RADIUS) ? "The point is inside the circle" : "The point is not inside the circle");


    }
}
