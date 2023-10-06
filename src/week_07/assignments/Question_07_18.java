package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }
        double[] bubbleSort = bubbleSort(numbers);
        for (double number : bubbleSort) {
            System.out.print(number + " ");
        }
    }

    public static double[] bubbleSort(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                double min = numbers[j];
                if (numbers[j + 1] < min) {
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }

            }
        }
        return numbers;
    }
}
