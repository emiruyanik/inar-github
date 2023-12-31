package week_03.assignments;

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();

        double p1x = input.nextDouble();
        double p1y = input.nextDouble();

        double p2x = input.nextDouble();
        double p2y = input.nextDouble();


        double formula = ((p1x - p0x) * (p2y - p0y)) - ((p2x - p0x) * (p1y - p0y));

        if (formula > 0) {
            System.out.println("(" + p2x + "," + p2y + ")" + " is on the left side of the line from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");
        } else if (formula == 0) {
            System.out.println("(" + p2x + "," + p2y + ")" + " is on the  the line from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");

        } else {
            System.out.println("(" + p2x + "," + p2y + ")" + " is on the right side of the line from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");
        }
    }
}
