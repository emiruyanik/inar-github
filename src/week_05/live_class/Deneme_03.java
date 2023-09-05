package week_05.live_class;

import java.util.Scanner;

public class Deneme_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int number1 = input.nextInt();

        System.out.println("Enter second integer:");
        int number2 = input.nextInt();

        int gcd = 1;



        for (int i = 2; i <= Math.min(number1, number2) ; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;

            }

        }
        System.out.printf("The greatest common divisor for %d and %d is %d", number1, number2, gcd);
    }
}
