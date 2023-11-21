package week_12.assignments;

import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double side3;

        boolean check = true;
        do {
            System.out.print("Enter three sides for the triangle:");

            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                check=false;
                System.out.println(triangle.toString());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }while (check);
    }
}