package week_05.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer:");
        int number1 = input.nextInt();

        System.out.print("\nEnter second integer:");
        int number2 = input.nextInt();

        int min = Math.min(number1, number2);
        boolean checking = true;

        while (checking) {
            if (number1 % min == 0 && number2 % min == 0) {
                checking = false;
            } else {
                min--;

            }
        }

        System.out.printf("\nThe greatest common divisor for %d and %d is %d", number1, number2, min);
    }
}
