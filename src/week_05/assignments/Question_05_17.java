package week_05.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 15");
        int numberOfLines = input.nextInt();

        while (!(numberOfLines >= 1 && numberOfLines <= 15)) {
            System.out.println("You have entered invalid value please enter again");

            numberOfLines = input.nextInt();
        }
       
    }

}
