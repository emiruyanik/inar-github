package week_04.assignments;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.println("Enter point1 (latitude and longitude) in degrees");
        double point1X = input.nextDouble();
        double point1y = input.nextDouble();

        System.out.println("Enter point2 (latitude and longitude) in degrees");
        double point2X = input.nextDouble();
        double point2y = input.nextDouble();

        // we compute the distance between two points in this process

        double distance = RADIUS * Math.acos(Math.sin(Math.toRadians(point1X)) * Math.sin(Math.toRadians(point2X)) + (Math.cos(Math.toRadians(point1X)) * Math.cos(Math.toRadians(point2X)) * Math.cos(Math.toRadians(point1y - point2y))));

        System.out.println("The distance between two points is " + distance);

    }
}