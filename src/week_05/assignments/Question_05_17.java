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
        for (int i = 1; i <= numberOfLines; i++) {
            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print("  ");

            }

            for (int j = 0; j < i; j++) {
                System.out.print(i - j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");

            }

            System.out.println();
        }

    }

}
