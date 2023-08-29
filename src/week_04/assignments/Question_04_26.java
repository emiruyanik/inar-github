package week_04.assignments;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount in dollars cents:");
        String amount = input.nextLine();

        double totalDollars = Double.parseDouble(amount);

        int multipliedBy100Amount = (int) (totalDollars * 100);
        int remainingAmount;

        int totalOneDollars = multipliedBy100Amount / 100;
        remainingAmount = multipliedBy100Amount % 100;


        int totalQuarters = remainingAmount / 25;
        remainingAmount = multipliedBy100Amount % 25;

        int totalDimes = remainingAmount/10;
        remainingAmount = multipliedBy100Amount % 10;

        int totalNickels = remainingAmount/5;
        remainingAmount = multipliedBy100Amount % 5;

        int totalPennies = remainingAmount;

        System.out.printf("Equivalent in monetary unıts:\nDollars:%d ",totalOneDollars);
        System.out.printf("\nQuarters:%d\nDimes:%d\nNickels:%d\nPennies:%d",totalQuarters,totalDimes,totalNickels
        ,totalPennies);



    }
}
