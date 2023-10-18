package week_08.live_class;

import java.util.Scanner;

public class FindNearestTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points:");
        int totalPoints = input.nextInt();

        double[][] points = new double[totalPoints][2];

        System.out.println("Enter " + totalPoints + " points");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        int p1 = 0;
        int p2 = 1;


        double shortestDistanceBetweenTwoPoints = distanceBetweenTwoPoints(points[p2][0], points[p2][1], points[p2][0], points[p2][1]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0], points[j][1]) < shortestDistanceBetweenTwoPoints) {
                    p1 = i;
                    p2 = j;
                    shortestDistanceBetweenTwoPoints = distanceBetweenTwoPoints(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }
        System.out.println("The closest two points are "+points[p1][0]+","+points[p1][1]+" and "+points[p2][0]+","+points[p2][1]);


    }

    public static double distanceBetweenTwoPoints(double x0, double y0, double x1, double y1) {
        return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
    }
}
