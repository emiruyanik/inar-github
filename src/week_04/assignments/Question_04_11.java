package week_04.assignments;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 between 15)");
        int decimalValue = input.nextInt();


        if (decimalValue <= 9) {
            System.out.println("The hex value is " + decimalValue);
        } else if (10 <= decimalValue && decimalValue <= 15) {
            char ch = (char) (decimalValue + 55);
            System.out.println("The hex value is " + ch);
        } else {
            System.out.println(decimalValue + " is an invalid input");
        }
    }
}
