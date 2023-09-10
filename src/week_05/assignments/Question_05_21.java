package week_05.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the loan amount");
        double loanAmount = input.nextInt();

        System.out.println("Enter the number of years");
        double numberOfYears = input.nextInt();

        double interestRate = 5.0;

        System.out.printf("%2s %25s %21s\n", "Interst Rate", "Monthly Payment", "Total Payment");

        while (interestRate <= 8.0) {
            double monthlyInterestRate = interestRate / 12.0 / 100.0;

            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12))));
            double totalPayment = monthlyPayment * 12.0 * numberOfYears;
            System.out.printf("%.3f %25.2f %24.2f\n", interestRate, monthlyPayment, totalPayment);

            interestRate += 0.125;
        }


    }
}
