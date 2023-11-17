package week_11.assignments;

import week_09.assignments.Account;

public class Question_11_08 {
    public static void main(String[] args) {
        Account account=new Account("emir",23,15000000);
        account.deposit(45254);
        System.out.println(account);
        System.out.println("____________________");

        account.deposit(5254);
        System.out.println(account);
        System.out.println("____________________");

        account.withdraw(458);
        System.out.println(account);
    }
}
