package week_12.assignments;

import java.util.Scanner;

public class Question_12_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean check = true;
        do {
            System.out.print("Enter annual interest rate:");
            double annualInterestRate = input.nextDouble();

            System.out.print("Enter loan amount:");
            double loanAmount = input.nextDouble();

            System.out.print("Enter number of years:");
            int numberOfYears = input.nextInt();

            try {
                Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
                System.out.println(loan);
                check = false;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        } while (check);
    }
}