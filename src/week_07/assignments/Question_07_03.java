package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100 (enter the zero to end the inputs): ");
        int[] numbers = new int[100];
        int numb;
        do {
            numb = input.nextInt();
            if (numb != 0) {
                numbers[numb - 1]++;
            }

        } while (numb != 0);
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print((i + 1) + " occurs " + numbers[i]);
                if (numbers[i] > 1) {
                    System.out.println(" times");
                } else {
                    System.out.println(" time");
                }
            }
        }
    }
}
