package week_06.assignments;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides:");
        int sidesOfPolygon = input.nextInt();

        System.out.print("Enter the side:");
        double side = input.nextDouble();

        System.out.println(area(sidesOfPolygon, side));
    }

    public static double area(int sides, double side) {
        return sides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / sides));
    }
}
