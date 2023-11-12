package week_10.assignments;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points:");

        double[][] arr = new double[5][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = input.nextDouble();
            arr[i][1] = input.nextDouble();
        }
        MyRectangle2D myRectangle2D = getRectangle(arr);
        System.out.println("Center is at(" + myRectangle2D.getX() + "," + myRectangle2D.getY() + ")");
        System.out.println("Width-->" + myRectangle2D.getWidth());
        System.out.println("Height-->"+myRectangle2D.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] arr) {
        double minX = arr[0][0];
        double minY = arr[0][1];
        double maxX = arr[0][0];
        double maxY = arr[0][1];

        for (double[] element : arr) {
            if (element[0] < minX) {
                minX = element[0];
            }
        }
        for (double[] item : arr) {
            if (item[1] < minY) {
                minY = item[1];
            }
        }
        for (double[] value : arr) {
            if (value[0] > maxX) {
                maxX = value[0];
            }
        }
        for (double[] doubles : arr) {
            if (doubles[1] > maxY) {
                maxY = doubles[1];
            }
        }
        double centerX = (maxX + minX) / 2;
        double centerY = (maxY + minY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new MyRectangle2D(centerX, centerY, width, height);

    }
}
