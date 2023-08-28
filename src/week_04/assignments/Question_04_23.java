package week_04.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week:");
        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate:");
        double hourlyPayRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate:");
        double federalTaxWithholdingRate = input.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double stateTaxWithholdingRate = input.nextDouble();

        System.out.println("Employee name:" + name);
        System.out.println("Hours worked:" + hours);
        System.out.println("Pay rate:" + hourlyPayRate);

        double grossPay = (hours * hourlyPayRate);
        System.out.println("Gross pay:" + grossPay);


        double totalFederalWithholding = federalTaxWithholdingRate * grossPay;
        System.out.printf("Deductions:\n   Federal Withholding  (%.2f): $%.2f", federalTaxWithholdingRate * 100, totalFederalWithholding);

        double totalStateWithholding = stateTaxWithholdingRate * grossPay;
        System.out.printf("\n   State Withholding  (%.2f): $%.2f", stateTaxWithholdingRate * 100, totalStateWithholding);

        double totalDeduction = totalFederalWithholding + totalStateWithholding;
        System.out.printf("\n   Total deduction:%.2f ", totalDeduction);

        System.out.printf("\nNet pay:%.2f", grossPay - totalDeduction);


    }
}
