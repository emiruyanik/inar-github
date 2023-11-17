package week_09.assignments;

import week_11.assignments.Transaction;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;


    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
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

    public void setBalance(double balance) {
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

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            char type = 'W';
            String description = "Withdrawn from the atm";
            Transaction transaction=new Transaction(type,amount,balance,description);
            transactions.add(transaction);

        }
    }

    public void deposit(double amount) {
        balance += amount;
        char type = 'D';
        String description = "Deposit to the bank";
        Transaction transaction=new Transaction(type,amount,balance,description);
        transactions.add(transaction);
    }

    public String getDate() {
        return dateCreated.toString();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\n'+
                "id=" + id +'\n'+
                "balance=" + balance +'\n'+
                "annualInterestRate=" + annualInterestRate +'\n'+
                "dateCreated=" + dateCreated +'\n'+
                "transactions=" + transactions.toString()
              ;
    }
}
