package week_03.assignments;

import java.util.Scanner;

public class Question_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width, and height");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        double leftEdge1 = r1x - (r1width / 2);
        double rightEdge1 = r1x + (r1width / 2);
        double topEdge1 = r1y + (r1height / 2);
        double bottomEdge1 = r1y - (r1height / 2);


        System.out.println("Enter r2's center x-, y-coordinates, width, and height");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        double leftEdge2 = r2x - (r2width / 2);
        double rightEdge2 = r2x + (r2width / 2);
        double topEdge2 = r2y + (r2height / 2);
        double bottomEdge2 = r2y - (r2height / 2);

        if (leftEdge2 >= leftEdge1 && rightEdge2 <= rightEdge1 &&
                topEdge2 <= topEdge1 && bottomEdge2 >= bottomEdge1) {
            System.out.println("r2 is inside the r1.");
        } else if (rightEdge2 < leftEdge1 || leftEdge2 > rightEdge1 ||
                topEdge2 < bottomEdge1 || bottomEdge2 > topEdge1) {
            System.out.println("r2 does not overlaps r1.");
        } else {
            System.out.println("r2 overlaps r1.");
        }
    }
}
