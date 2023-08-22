package week_03.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer :");
        int isbn = input.nextInt();
        int remainingOfIsbn = isbn;
        int[] numbers = new int[9];


        if (isbn < 100000000) {

            for (int i = 0; i < 8; i++) {

                numbers[i] = remainingOfIsbn % 10;
                remainingOfIsbn = remainingOfIsbn / 10;

            }

        } else {

            for (int j = 0; j < 9; j++) {
                if (remainingOfIsbn > 9) {
                    numbers[j] = remainingOfIsbn % 10;
                    remainingOfIsbn /= 10;

                } else {
                    numbers[8] = remainingOfIsbn;
                }

            }

        }
        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            checksum = checksum + (numbers[i] * (9 - i));
        }
        if (checksum % 11 == 10) {
            if (isbn < 100000000) {
                System.out.println(0 + "" + isbn + "x");
            } else {
                System.out.println(isbn + "x");
            }
        } else {
            if (isbn < 100000000) {
                System.out.println(0 + "" + isbn + ""+checksum % 11);
            } else {
                System.out.println(isbn + "" + checksum % 11);


            }
        }
    }
}

