package week_03.assignments;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB :");
        double dollarsToRMB = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int number = input.nextInt();

        double amount = 0;
        double totalMoney = 0;

        if (number == 0) {
            System.out.println("Enter the dollar amount");
            amount = input.nextDouble();

            totalMoney = amount * dollarsToRMB;
            System.out.println("$" + amount + " is " + totalMoney + " yuan");

        } else if (number == 1) {
            System.out.println("Enter the RMB amount");
            amount = input.nextDouble();

            totalMoney = amount / dollarsToRMB;
            System.out.println("Yuan " + amount + " is " + ((int) (totalMoney * 100)) / 100.0 + " $");

        } else {
            System.out.println("İnvalid number");
        }
    }
}
