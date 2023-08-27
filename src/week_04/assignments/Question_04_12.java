package week_04.assignments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit");
        String ch = input.nextLine();
        int valueOfCh = 0;

        if (ch.length() == 1) {
            valueOfCh = (int) (ch.charAt(0));
        } else {
            System.out.println(ch + " is an invalid input ");
            System.exit(1);
        }

        if (48 <= valueOfCh && valueOfCh <= 57) {
            valueOfCh = valueOfCh - 48;

        } else if (65 <= valueOfCh && valueOfCh <= 70) {
            valueOfCh = valueOfCh - 55;


        }else {
            System.out.println(ch + " is an invalid input ");
            System.exit(2);
        }

        //in this process we compute the binary value
        int fourthDigitOfValue = valueOfCh % 2;
        valueOfCh = valueOfCh / 2;

        int thirthDigitOfValue = valueOfCh % 2;
        valueOfCh = valueOfCh / 2;

        int secondDigitOfValue = valueOfCh % 2;
        valueOfCh = valueOfCh / 2;

        int firstDigitOfValue = valueOfCh;

        System.out.printf("The binary value is %d%d%d%d ", firstDigitOfValue, secondDigitOfValue, thirthDigitOfValue, fourthDigitOfValue);
    }
}
