package week_03.assignments;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a b c ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double discriminant = (b * b) - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

            System.out.println("The equation has two roots" + r1 + " " + r2);
        } else if (discriminant == 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            System.out.println("The equation has one root " + r1);


        } else {
            System.out.println("The equation has no  real roots");
        }

        }

    }

