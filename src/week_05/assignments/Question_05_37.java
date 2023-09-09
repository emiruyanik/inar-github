package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer:");
        int receivedNumber = input.nextInt();

        int counter = 0;
        boolean isDigitOne = true;
        //to find total turning of the loop i made this process
        int dividingToTwo = receivedNumber;

        while (isDigitOne) {
            dividingToTwo = dividingToTwo / 2;
            counter++;
            if (dividingToTwo == 1) {
                isDigitOne = false;
            }
        }


        int totalTurningOfTheLoop = counter;

        String binaryValue = "";

        for (int i = 0; i <= totalTurningOfTheLoop; i++) {
            int moddingOfReceivedNumber = receivedNumber % 2;
            if (i != totalTurningOfTheLoop - 1) {
                receivedNumber = receivedNumber / 2;
            }

            if (i != totalTurningOfTheLoop) {
                binaryValue += moddingOfReceivedNumber;
            } else {
                binaryValue += receivedNumber;
            }


        }

        String reverseOfBinaryValues ="";
        for (int i =counter; i>=0; i--) {
            reverseOfBinaryValues+=binaryValue.charAt(i);
        }

        System.out.printf("The binary value of the decimal\"%d\" is: %s", receivedNumber, reverseOfBinaryValues);

    }
}
