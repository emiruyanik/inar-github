package week_12.assignments;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
       this(2.5,1,2000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException{
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate<0){
            throw new IllegalArgumentException("Wrong input please enter greater than zero!");
        }else {
            this.annualInterestRate = annualInterestRate;
        }

    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears<0){
            throw new IllegalArgumentException("Wrong input please enter greater than zero!");
        }else {
            this.numberOfYears = numberOfYears;
        }

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount<0){
            throw new IllegalArgumentException("Wrong input please enter greater than zero!");
        }else {
            this.loanAmount = loanAmount;
        }

    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 100 / 12;
        return (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    public double getTotalPayment() {
        return 12 * getMonthlyPayment();
    }

    @Override
    public String toString() {
        return
                "annualInterestRate=" + annualInterestRate + '\n' +
                        "numberOfYears=" + numberOfYears + '\n' +
                        "loanAmount=" + loanAmount + '\n' +
                        "loanDate=" + loanDate
                ;
    }
}
