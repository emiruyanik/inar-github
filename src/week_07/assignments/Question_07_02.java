package week_07.assignments;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        int[] reverseOfNumbers = reverse(numbers);
        print(reverseOfNumbers);

    }

    public static void print(int[] reverseOfNumbers) {
        for (int i = 0; i < reverseOfNumbers.length; i++) {
            System.out.print(reverseOfNumbers[i] + " ");
        }
    }

    public static int[] reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }

}
