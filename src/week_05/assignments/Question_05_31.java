package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount:");
        double initialDepositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield:");
        double percentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months):");
        int maturityPeriod = input.nextInt();

        System.out.println("Month CD value");

        for (int i = 1; i <= maturityPeriod; i++) {

            initialDepositAmount += initialDepositAmount * percentageYield / 1200;
            System.out.printf("%d     %.2f\n", i, initialDepositAmount);
        }
    }
}
