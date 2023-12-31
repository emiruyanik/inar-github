package week_07.assignments;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            double numb = input.nextDouble();
            numbers[i] = numb;
        }
        System.out.println("The minimum number is " + min(numbers));
    }

    public static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
