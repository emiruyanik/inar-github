package week_08.assignments;

import java.util.Map;
import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {

        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");

        double[][] points = createArray(4);
        double[] areas = findTheAreas(points);

        System.out.print("The areas are: ");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%.2f  ", areas[i]);
        }
    }

    public static double[] findTheAreas(double[][] points) {
        double[] areas = new double[4];
        int count = 0;
        for (int i = 0; i < points[0].length; i++) {
            double pointX1 = points[i][0];
            double pointY1 = points[i][1];
            for (int j = i + 1; j <= points[0].length; j++) {
                double pointX2 = points[j][0];
                double pointY2 = points[j][1];
                for (int k = j + 1; k < points.length; k++) {
                    double pointX3 = points[k][0];
                    double pointY3 = points[k][1];
                    areas[count] = areas(pointX1, pointY1, pointX2, pointY2, pointX3, pointY3);
                    count++;

                }
            }
        }
        return areas;
    }

    public static double areas(double pointX1, double pointY1, double pointX2, double pointY2, double pointX3, double pointY3) {
        double distance1 = findTheDistanceBetweenTwoPoints(pointX1, pointY1, pointX2, pointY2);
        double distance2 = findTheDistanceBetweenTwoPoints(pointX1, pointY1, pointX3, pointY3);
        double distance3 = findTheDistanceBetweenTwoPoints(pointX2, pointY2, pointX3, pointY3);

        double s = (distance1 + distance2 + distance3) / 2;


        return  Math.sqrt(s * (s - distance1) * (s - distance2) * (s - distance3));
    }

    public static double findTheDistanceBetweenTwoPoints(double pointX1, double pointY1, double pointX2, double pointY2) {
        return Math.sqrt(Math.pow(pointX2 - pointX1, 2) + Math.pow(pointY2 - pointY1, 2));
    }

    public static double[][] createArray(int points) {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[points][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

}
