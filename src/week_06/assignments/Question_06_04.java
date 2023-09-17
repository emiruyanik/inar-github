package week_06.assignments;

import java.util.Scanner;

public class Question_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Display an integer reversed:");

        System.out.print("\nEnter an integer:");
        int numb = input.nextInt();
        reverse(numb);


    }

    public static void reverse(int numb) {
        String digits = numb + "";
        String reverseDigits = "";
        for (int i = digits.length(); i > 0; i--) {
            reverseDigits += digits.charAt(i - 1);
        }
        System.out.println(reverseDigits);
    }
}
