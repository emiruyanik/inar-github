package week_06.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        long number = input.nextLong();

        int totalDigitsOfNumber = sumDigits(number);

        System.out.printf("Sum of all digits of %d is %d", number, totalDigitsOfNumber);


    }

    public static int sumDigits(long number) {
        int total = 0;

        do {
            long digit = number % 10;
            total += (int) digit;
            number = number / 10;
        } while (number != 0);

        return total;
    }
}
