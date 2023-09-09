package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer:");
        int number = input.nextInt();

        boolean isOneDigit = true;
        int counter = 0;

        int secondNumber = number;

        while (isOneDigit) {
            secondNumber = secondNumber / 8;
            counter++;
            if (secondNumber == 8) {
                isOneDigit = true;
            }else {
                isOneDigit=false;
            }
        }

        String octalNumbers = "";
        int numberThree = number;
        for (int i = 0; i <= counter; i++) {
            if (i != counter) {
                int moddingOfNumberToEight = numberThree % 8;
                octalNumbers += moddingOfNumberToEight;
                numberThree = numberThree / 8;
            } else {
                octalNumbers += numberThree;
            }


        }

        String reverseOfOctalNumbers = "";

        for (int i = counter; i >= 0; i--) {

            reverseOfOctalNumbers+=octalNumbers.charAt(i);

        }
        System.out.println(reverseOfOctalNumbers);
    }
}
