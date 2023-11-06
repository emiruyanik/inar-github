package week_10.assignments;

import week_09.assignments.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {

        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        Scanner input = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Enter an id:");
            int id = input.nextInt();
            boolean checkId = false;
            do {
                for (Account account : accounts) {
                    if (id == account.getId()) {
                        checkId = true;
                    }


                }
                if (!checkId) {
                    System.out.println("you have entered an invalid value please try again:");
                    id = input.nextInt();
                }


            } while (!checkId);
            Account account = accounts[id];
            boolean isExit = false;
            do {

                System.out.println("Main menu");
                System.out.println(" 1:check balance");
                System.out.println(" 2:withdraw");
                System.out.println(" 3:deposit");
                System.out.println(" 4:exit");
                System.out.print("Enter a choice:");
                boolean checkChoice = false;
                int choice;
                do {
                    choice = input.nextInt();
                    if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                        checkChoice = true;
                    } else {
                        System.out.println("Invalid choice please correct your choice:");
                    }
                } while (!checkChoice);

                if (choice == 1) {
                    System.out.println("The balance is:" + accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.println("Enter an amount to withdraw");
                    int withdrawAmount = input.nextInt();
                    accounts[id].withdraw(withdrawAmount);
                } else if (choice == 3) {
                    System.out.println("Enter an amount to deposit");
                    int depositAmount = input.nextInt();
                    accounts[id].deposit(depositAmount);
                } else {
                    isExit = true;
                }

            } while (!isExit);


        } while (check);

    }
}