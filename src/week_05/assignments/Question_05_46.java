package week_05.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String normalSt = input.nextLine();

        int lengthOfNormalSt = normalSt.length();

        String reversedSt = "";
        for (int i = 1; i <= lengthOfNormalSt; i++) {
            reversedSt += normalSt.charAt(lengthOfNormalSt - i);

        }

        System.out.println("The reversed string is " + reversedSt);
    }
}
