package week_08.assignments;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] points = getPoints(3, 2);
        double area = getAreaOfTriangle(points);
        boolean isTriangle = isTriangle(points);

        System.out.println((isTriangle) ? area : "The three points are on the same line");

    }

    public static boolean isTriangle(double[][] points) {
        double m = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        return m != (points[2][1] - points[0][1]) / (points[2][0] - points[0][0]) && m != (points[2][1] - points[1][1]) / (points[2][0] - points[1][0]);
    }

    public static double[][] getPoints(int row, int column) {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[row][column];

        System.out.println("Enter x1,y1,x2,y2,x3,y3:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }

    public static double getAreaOfTriangle(double[][] points) {
        double distance1 = findTheDistanceBetweenTwoPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
        double distance2 = findTheDistanceBetweenTwoPoints(points[0][0], points[0][1], points[2][0], points[2][1]);
        double distance3 = findTheDistanceBetweenTwoPoints(points[2][0], points[2][1], points[1][0], points[1][1]);

        double s = (distance1 + distance2 + distance3) / 2;

        return Math.sqrt(s * (s - distance1) * (s - distance2) * (s - distance3));

    }

    private static double findTheDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
