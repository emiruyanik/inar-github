package week_05.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the loan amount:");
        double loanAmount = input.nextDouble();

        System.out.print("\nEnter the number of years:");
        double numberOfYears = input.nextDouble();

        System.out.print("\nEnter the annual interest rate:");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12.0 / 100.0;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));

        double totalPayment = monthlyPayment * 12.0 * numberOfYears;

        System.out.printf("\nLoan Amount: %.2f", loanAmount);
        System.out.printf("\nNumber of years: %d", (int) numberOfYears);
        System.out.printf("\nAnnual interest rate: %.2f", annualInterestRate);
        System.out.printf("\nMonthly Payment: %.2f", monthlyPayment);
        System.out.printf("\nTotal Payment: %.2f", totalPayment);

        double interest;
        double principal;
        double balance = loanAmount;

        System.out.printf("\n%-10s %10s %10s %10s", "Payment", "Interest", "Principal", "Balance");

        for (int i = 1; i <= 12; i++) {

            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;

            System.out.printf("\n%-10d %10.2f %10.2f %10.2f", i, interest, principal, balance);


        }

    }
}
