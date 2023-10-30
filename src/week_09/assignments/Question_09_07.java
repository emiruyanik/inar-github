package week_09.assignments;

public class Question_09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.withdraw(2500);
        account.deposit(3000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account ID :" + account.getId());
        System.out.println("Date created :" + account.getDate());
        System.out.println("Balance :" + account.getBalance());
        System.out.println("Monthly interest rate :" + account.getMonthlyInterestRate());
    }
}
