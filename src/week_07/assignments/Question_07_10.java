package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            double numb = input.nextDouble();
            numbers[i] = numb;
        }
        double min = Question_07_09.min(numbers);
        int index = indexOfSmallestIndex(numbers);
        System.out.println("The minimum number is " + min + " index " + index);

    }

    public static int indexOfSmallestIndex(double[] numbers) {
        double min = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                index = i;
            }
        }
        return index;
    }
}
