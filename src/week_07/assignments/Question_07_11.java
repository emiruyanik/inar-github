package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            double numb = input.nextDouble();
            numbers[i] = numb;
        }
        double mean = mean(numbers);
        double deviation = deviation(numbers);
        System.out.println("The mean is:" + mean);
        System.out.println("The standard deviation is:" + deviation);
    }

    public static double deviation(double[] numbers) {
        double mean = mean(numbers);
        double total = 0;
        for (double numb : numbers) {
            total += Math.pow(numb - mean, 2);
        }
        return Math.sqrt(total / (numbers.length - 1));
    }

    public static double mean(double[] numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / (numbers.length);
    }
}
