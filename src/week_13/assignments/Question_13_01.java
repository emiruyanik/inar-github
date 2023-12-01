package week_13.assignments;

import java.util.Scanner;

public class Question_13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle:");

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        input.nextLine();

        System.out.print("Enter the colour:");
        String colour = input.nextLine();

        System.out.println("Enter is filled?(true or false):");
        String strOfIsFilled = input.nextLine();

        boolean isFilled;

        isFilled= strOfIsFilled.equals("true");
        GeometricObject triangle=new Triangle(colour,isFilled,side1,side2,side3);
        System.out.println(triangle);
    }
}
