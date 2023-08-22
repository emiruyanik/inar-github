package week_03.assignments;

import java.util.Scanner;

public class Question_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a b c d e f :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();


        if (a * d - b * c != 0) {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - b * c) / (a * d - b * c);
            System.out.println("x is " + x + " y is " + y);
        } else {
            System.out.println("The equation has no solution");
        }


    }
}
