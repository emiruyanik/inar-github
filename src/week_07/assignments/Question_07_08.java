package week_07.assignments;

import java.util.Scanner;

public class Question_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten double values:");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            double numb = input.nextDouble();
            numbers[i] = numb;
        }
        System.out.println("The average value " + average(numbers));
    }

    public static double average(double[] numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    public static double average(int[] numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
}
