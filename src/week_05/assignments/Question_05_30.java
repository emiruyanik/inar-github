package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g.,100):");
        double amount = input.nextDouble();
        final double STABLE_AMOUNT = amount;

        System.out.print("\nEnter the annual interest rate:");
        double interestRate = input.nextDouble();

        System.out.print("\nEnter the number of months:");
        int months = input.nextInt();

        double monthlyInterestRate = interestRate / 12 / 100;
        double totalAccount = 0;


        for (int i = 1; i <= months; i++) {
            amount = amount + (monthlyInterestRate * amount);
            if (i != months) {
                amount = amount + STABLE_AMOUNT;

            }

        }
        System.out.println("Amount in saving account is:" + amount);

    }
}
