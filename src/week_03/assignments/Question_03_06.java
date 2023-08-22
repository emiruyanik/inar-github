package week_03.assignments;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KİLOGRAM_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final int INCHES_PER_FEET = 12;


        System.out.println("Enter weight in pounds");
        int receivedPound = input.nextInt();

        System.out.println("Enter feet");
        int receivedFeet = input.nextInt();

        System.out.println("Enter inches");
        int receivedInches = input.nextInt();


        int totalInches = receivedInches + (receivedFeet * 12);

        double convertedMeters = totalInches * METERS_PER_INCH;
        double convertedKilograms = receivedPound * KİLOGRAM_PER_POUNDS;

        double bmi = convertedKilograms / (convertedMeters * convertedMeters);
        System.out.println("Your BMI is "+ bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");

        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obese");
        }


    }
}
