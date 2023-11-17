package week_11.assignments;

import week_10.assignments.MyPoint;

import java.util.Scanner;

public class Question_11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points:");
        int totalPoint = input.nextInt();

        MyPoint[] myPoints = new MyPoint[totalPoint];
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < totalPoint; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();

            MyPoint myPoint = new MyPoint(x, y);
            myPoints[i] = myPoint;

        }
    }
}
