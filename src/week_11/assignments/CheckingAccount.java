package week_11.assignments;

import week_09.assignments.Account;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {

    }
    public CheckingAccount(int id, int balance){
        super(id, balance);
        this.limit = -500;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() >= this.limit) {
            super.withdraw(amount);
        }
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "ID:" + super.getId() + '\'' +
                "Balance:" + super.getBalance() + '\'' +
                "limit:=" + limit
                ;
    }
}