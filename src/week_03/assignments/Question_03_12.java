package week_03.assignments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit integer");
        int threeDigitNumber = input.nextInt();
        int number3 = threeDigitNumber % 10;
        int remainingThreeDigitNumber = threeDigitNumber / 10;
        int number2 = remainingThreeDigitNumber % 10;
        int number1 = remainingThreeDigitNumber / 10;

        if (threeDigitNumber > 99) {
            if (number1 == number3) {
                System.out.println(threeDigitNumber + " is a palindrome");
            } else {
                System.out.println(threeDigitNumber + " is not a palindrome");
            }
        }
        else {
            System.out.println("İnvalid value try again please");
        }
    }
}