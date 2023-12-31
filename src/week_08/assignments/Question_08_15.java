package week_08.assignments;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points:");
        double[][] points = new double[5][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        boolean sameLine = sameLine(points);
        System.out.println((sameLine) ? "The five points are on the same line" : "The five points are not on the same line");
    }

    public static boolean sameLine(double[][] points) {
        double slop = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        for (int i = 2; i < points.length; i++) {
            if ((points[i][1] - points[0][1]) / (points[i][0] - points[0][0]) != slop) {
                return false;
            }
        }
        return true;
    }
}
