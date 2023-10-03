package week_07.assignments;

import java.util.Scanner;

import static week_07.assignments.Question_07_02.reverse;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int numb = input.nextInt();
            numbers[i] = numb;
        }
        int[] reverse = reverseOfArray(numbers);
        for (int numb : numbers) {
            System.out.print(numb + " ");

        }
    }

    public static int[] reverseOfArray(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

        }
        return numbers;
    }
}
