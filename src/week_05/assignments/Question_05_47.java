package week_05.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String isbnNumbers = "";

        do {
            System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
            isbnNumbers = input.nextLine();
            if (isbnNumbers.length() != 12) {
                System.out.println("Invalid input");
            }
        } while (isbnNumbers.length() != 12);

        int[] digitsOfIsbn = new int[isbnNumbers.length()];

        for (int i = 0; i < isbnNumbers.length(); i++) {
            digitsOfIsbn[i] = Integer.parseInt(isbnNumbers.charAt(i) + "");


        }
        int totalNumberOfIsbn = 0;
        for (int i = 1; i <= isbnNumbers.length(); i++) {
            if ((i - 1) % 2 == 0) {
                totalNumberOfIsbn += digitsOfIsbn[i - 1];
            } else {
                totalNumberOfIsbn += digitsOfIsbn[i - 1] * 3;
            }


        }
        int formulaOfLastNumber = 10 - (totalNumberOfIsbn % 10);
        if (formulaOfLastNumber == 10) {
            System.out.println(isbnNumbers + 0);

        } else {
            System.out.println(isbnNumbers + formulaOfLastNumber);
        }

    }
}
