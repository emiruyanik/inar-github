package week_03.assignments;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double circle1x = input.nextDouble();
        double circle1y = input.nextDouble();
        double circle1Radius = input.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
        double circle2x = input.nextDouble();
        double circle2y = input.nextDouble();
        double circle2Radius = input.nextDouble();

        double distanceBetweenRadius = Math.sqrt(((circle2x-circle1x) * (circle2x-circle1x)) + ((circle2y-circle1y) * (circle2y-circle1y)));

        if (Math.abs(circle1Radius-circle2Radius)>=distanceBetweenRadius){
            System.out.println("Circle2 is inside circle1");
        } else if (circle1Radius+circle2Radius>=distanceBetweenRadius) {
            System.out.println("Circle2 overlaps circle1");
            
        }else {
            System.out.println("Circle2 does not overlaps circle1");
        }

    }
}
