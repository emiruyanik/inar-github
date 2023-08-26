package week_04.assignments;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the bounding circle");
        double radius = input.nextDouble();

        double radius1 = 0;
        double radius2 = 72;
        double radius3 = 144;
        double radius4 = 216;
        double radius5 = 288;


        // in this process  we generated random  ( x and y points) in the circle
        double x1 = radius * Math.cos(Math.toRadians(radius1));
        double y1 = radius * Math.sin(Math.toRadians(radius1));

        double x2 = radius * Math.cos(Math.toRadians(radius2));
        double y2 = radius * Math.sin(Math.toRadians(radius2));

        double x3 = radius * Math.cos(Math.toRadians(radius3));
        double y3 = radius * Math.sin(Math.toRadians(radius3));

        double x4 = radius * Math.cos(Math.toRadians(radius4));
        double y4 = radius * Math.sin(Math.toRadians(radius4));

        double x5 = radius * Math.cos(Math.toRadians(radius5));
        double y5 = radius * Math.sin(Math.toRadians(radius5));

        System.out.println("The coordinates of five points on the pentagon are");

        System.out.println(x1+","+y1);
        System.out.println(x2+","+y2);
        System.out.println(x3+","+y3);
        System.out.println(x4+","+y4);
        System.out.println(x5+","+y5);
    }
}
