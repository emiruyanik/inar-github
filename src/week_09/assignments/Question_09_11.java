package week_09.assignments;

import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f:");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double d = input.nextInt();
        double e = input.nextInt();
        double f = input.nextInt();
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() + " and " + linearEquation.getY());
        } else {
            System.out.println("The linear equation has no solution");
        }

    }
}
