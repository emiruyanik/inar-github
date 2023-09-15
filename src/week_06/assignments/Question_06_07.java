package week_06.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested:");
        double amountInvested = input.nextDouble();

        System.out.print("Annual interest rate:");
        double annualInterestRate = input.nextDouble();



        for (int i = 1; i <=30 ; i++) {
           double yearlyAmount = futureInvestmentValue(amountInvested,annualInterestRate,i);
            System.out.printf("%.2f\n",yearlyAmount);
        }
    }
    public static double futureInvestmentValue(double investmentAmount,double annualInterestRate,int i){
        double monthlyInterestRate = monthlyInterestRate(annualInterestRate);
        double futureInvestmentAmount =investmentAmount*Math.pow((1+monthlyInterestRate),i*12);

        return futureInvestmentAmount;
    }
    public static double monthlyInterestRate(double annualInterestRate){
        return annualInterestRate/12/100.0;
    }

}
