package week_11.assignments;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter three sides of the triangle:");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();

        input.nextLine();

        System.out.print("Enter a colour:");
        String colour= input.nextLine();

        System.out.print("Is the triangle is filled(true/false:)");
        String trueOrFalse=input.nextLine();
        boolean isFilled;
        isFilled= trueOrFalse.equalsIgnoreCase("true");

        Triangle triangle =new Triangle(colour,isFilled,side1,side2,side3);
        System.out.println(triangle);

    }
}
