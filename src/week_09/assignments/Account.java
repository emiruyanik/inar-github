package week_09.assignments;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, int balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return balance * (getAnnualInterestRate() / 100 / 12);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public String getDate() {
        return dateCreated.toString();
    }
}
