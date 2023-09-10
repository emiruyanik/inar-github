package week_05.assignments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int number = input.nextInt();

        int divisor = 2;


        String factorsOfNumber = "";

        do {
            if (number % divisor == 0) {
                factorsOfNumber = factorsOfNumber + divisor + " ";
                number = number / divisor;

            } else {
                divisor++;
            }
        } while (number != 1);

        System.out.println(factorsOfNumber);

    }
}
