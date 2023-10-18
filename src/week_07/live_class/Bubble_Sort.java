package week_07.live_class;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);
        for (int numb : numbers) {
            System.out.print(numb + " ");
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int min = numbers[j];
                if (min > numbers[j + 1]) {
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
    }
}
