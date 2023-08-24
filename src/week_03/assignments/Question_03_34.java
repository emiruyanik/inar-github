package week_03.assignments;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();

        double p1x = input.nextDouble();
        double p1y = input.nextDouble();

        double p2x = input.nextDouble();
        double p2y = input.nextDouble();


        double m1 = (p1y - p0y) / (p1x - p0x);
        double m2 = (p2y - p0y) / (p2x - p0x);

        if (m1 == m2) {
            if (p2x >= Math.min(p0x, p1x) && p2x <= Math.max(p0x, p1x) && (p2y >= Math.min(p0y, p1y) && p2x <= Math.max(p0y, p1y))){
                System.out.println("(" + p2x + "," + p2y + ")" + " is on the line segment from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");
            }else {
                System.out.println("(" + p2x + "," + p2y + ")" + " is not on the line segment from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");
            }

        } else {
            System.out.println("(" + p2x + "," + p2y + ")" + " is not on the line segment from " + "(" + p0x + "," + p0y + ")" + " to " + "(" + p1x + "," + p1y + ")");
        }


    }
}
