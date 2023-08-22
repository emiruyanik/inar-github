package week_03.assignments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        final double widthOfRectangle = 10.0;
        final double heightOfRectangle = 5.0;


        System.out.println("Enter the point with two coordinates");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distancToHorizantal=Math.sqrt(x*x);
        double distancToVertical=Math.sqrt(y*y);

        if ((widthOfRectangle/2)>=distancToHorizantal&&(heightOfRectangle/2)>=distancToVertical){
            System.out.println("The point is in the rectangle");
        }
        else {
            System.out.println("The point is not in the rectangle");
        }


    }
}
