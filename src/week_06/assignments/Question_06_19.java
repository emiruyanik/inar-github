package week_06.assignments;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle:");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.println((isValidTriangle(s1, s2, s3)) ? "The area of triangle is " + area(s1, s2, s3) :
                "invalid input!");
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        boolean result;
        if (side1 > side2 + side3) {
            result = false;
        } else if (side2 > side1 + side3) {
            result = false;

        } else if (side3 > side1 + side2) {
            result = false;


        } else {
            result = true;
        }
        return result;
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}
