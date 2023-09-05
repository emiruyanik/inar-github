package week_05;

public class asd {
    public static void main(String[] args) {
        double interestRate = 5.00;
        double loanAmount = 10000;
        double numberOfYears = 5;

        double monthlyInterestRate = 5 / 12.0;

        double monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate),(numberOfYears*12))));
        System.out.println(monthlyPayment);
    }
}
