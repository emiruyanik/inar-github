package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double[] sortedNumbers = sorted(numbers);
        for (double numb : sortedNumbers) {
            System.out.print(numb + " ");
        }

    }

    public static double[] sorted(double[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            double maxNumber = numbers[i];
            int currentIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] > maxNumber) {
                    maxNumber = numbers[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                numbers[currentIndex] = numbers[i];
                numbers[i] = maxNumber;

            }
        }
        return numbers;
    }
}
