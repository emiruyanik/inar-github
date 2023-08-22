package week_03.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package(in pounds)");
        double weight = input.nextDouble();

        double cost = 0;

        if (1 >= weight && weight > 0) {
            cost = 3.5 * weight;
            System.out.println("Shipping cost of package is " + cost);
        } else if (3 >= weight && weight > 1) {
            cost = 5.5 * weight;
            System.out.println("Shipping cost of package is " + cost);


        } else if (10 >= weight && weight > 3) {
            cost = 8.5 * weight;
            System.out.println("Shipping cost of package is " + cost);


        } else if (20 >= weight && weight > 10) {
            cost = 10.5 * weight;
            System.out.println("Shipping cost of package is " + cost);
        } else {
            System.out.println("The package can not be shipped");
        }

    }

    }


