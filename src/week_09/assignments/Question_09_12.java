package week_09.assignments;

import java.util.Scanner;

public class Question_09_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        IntersectingPoint intersectingPoint = new IntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);
        if (intersectingPoint.isParallel()) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at " + intersectingPoint.getIntersectingPoints()[0] + "," + intersectingPoint.getIntersectingPoints()[1]);
        }

    }
}
