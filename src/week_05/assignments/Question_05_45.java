package week_05.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers");
        double[] numbers = new double[10];

        double totalTenNumbers = 0;
        double totalSquaresOfTenNumbers = 0;

        for (int i = 0; i < 10; i++) {

            numbers[i] = input.nextDouble();

        }

        for (int i = 0; i < 10; i++) {

            totalTenNumbers += numbers[i];
            totalSquaresOfTenNumbers += Math.pow(numbers[i], 2);

        }

        double mean = totalTenNumbers / 10.0;
        double deviation = Math.sqrt((totalSquaresOfTenNumbers - (Math.pow(totalTenNumbers, 2) / 10)) / 9);

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation  is " + deviation);
    }
}
