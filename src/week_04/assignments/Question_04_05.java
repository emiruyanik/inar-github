package week_04.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        double side = input.nextDouble();

        System.out.println("Enter the side");
        double sideLength = input.nextDouble();

        double area = (side * (Math.pow(sideLength, 2))) / (4 * Math.tan(Math.PI / side));

        System.out.println("The area of the polygon is " + area);

    }
}
