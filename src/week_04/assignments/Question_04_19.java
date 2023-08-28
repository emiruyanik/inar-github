package week_04.assignments;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as an integer: ");
        String isbn = input.nextLine();

        if (isbn.length() != 9) {
            System.out.println("You have not entered 9 digits");
            System.exit(1);
        }
        int[] chars = new int[9];
        for (int i = 1; i <= 9; i++) {
            if ('0' <= isbn.charAt(i - 1) && isbn.charAt(i - 1) <= '9') {
                chars[i - 1] = isbn.charAt(i - 1) - '0';

            } else {
                System.out.println("You have entered invalid value");
                System.exit(2);
            }
        }
        //in this process we calculate the tenth digit

        int tenthDigit = 0;

        for (int j = 1; j <= 9; j++) {
            tenthDigit = tenthDigit + (chars[j - 1] * j);


        }
        if (tenthDigit % 11 == 10) {
            System.out.printf("The ISBN-10 number is %sX",isbn);


        }
        else {
            System.out.printf("The ISBN-10 number is %s%d",isbn,tenthDigit%11);

        }
    }
}