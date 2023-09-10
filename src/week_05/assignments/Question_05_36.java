package week_05.assignments;

import java.util.Scanner;

public class Question_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first 9 digits of an ISBN:");

        String stNumbers = "";
        int counter = 0;

        int[] numbers = new int[9];
        while (counter < 9) {
            int receivedNumber = input.nextInt();
            if (receivedNumber < 10 && receivedNumber >= 0) {
                numbers[counter] = receivedNumber;
                stNumbers += numbers[counter];
                counter++;
            } else {
                System.out.println("You have entered invalid value ");
            }


        }

        int total = 0;

        for (int i = 0; i < 9; i++) {
            total = total + (numbers[i] * (i + 1));
        }
        if (total % 11 == 10) {
            stNumbers += "X";
        } else {
            stNumbers += (total % 11);
        }

        System.out.println(stNumbers);
    }

}
