package week_03.assignments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1:");
        double package1Weight = input.nextDouble();
        double package1Price = input.nextDouble();

        double package1Productivity = package1Price / package1Weight;

        System.out.println("Enter weight and price for package 2:");
        double package2Weight = input.nextDouble();
        double package2Price = input.nextDouble();

        double package2Productivity = package2Price / package2Weight;

        if (package1Productivity > package2Productivity) {
            System.out.println("Package2 has a better price");
        } else if (package2Productivity > package1Productivity) {
            System.out.println("Package1 has a better price");

        } else {
            System.out.println("Two packages have same price");
        }


    }
}
