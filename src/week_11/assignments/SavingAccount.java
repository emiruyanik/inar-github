package week_11.assignments;

import week_09.assignments.Account;

public class SavingAccount extends Account {
    public SavingAccount(int id, int balance) {
        super(id,balance);

    }

    @Override
    public String toString() {
        return "ID:" + super.getId() + '\'' +
                "Balance:" + super.getBalance();
    }
}
