package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values:");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        boolean check = isConsecutiveFour(numbers);
        System.out.println(check ? "The list has consecutive fours" : "The list has no consecutive fours");

    }

    public static boolean isConsecutiveFour(int[] numbers) {

        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {

            count++;
            if (numbers[i] == numbers[i + 1]) {

                count++;
            } else {

                count = 0;
            }
            if (count == 4) {
                return true;
            }

        }

        return false;
    }
}
