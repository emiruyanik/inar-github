package week_08.assignments;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points:");
        int numberOfPoints = input.nextInt();

        System.out.print("Enter " + numberOfPoints + " points");
        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        double closestPoint = findTheClosestPoint(points);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0], points[j][1]) == closestPoint) {
                    System.out.println("The closest two points are (" + points[i][0] + "," + points[i][1] + ")" + "(" + points[j][0] + "," + points[j][1] + ")");
                }


            }
        }
        System.out.println("Their distance is " + closestPoint);
    }

    public static double findTheClosestPoint(double[][] points) {
        double currentClosestPoint = distanceBetweenTwoPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double closestPoint = distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (closestPoint < currentClosestPoint) {
                    currentClosestPoint = closestPoint;
                }
            }
        }
        return currentClosestPoint;
    }

    public static double distanceBetweenTwoPoints(double x0, double yo, double x1, double y1) {
        return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(yo - y1, 2));
    }
}
