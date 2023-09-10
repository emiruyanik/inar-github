package week_05.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string:");
        String firstSt = input.nextLine();

        System.out.print("Enter the second string:");
        String secondSt = input.nextLine();

        int lengthOfFirstSt =firstSt.length();
        int lengthOfSecondSt =secondSt.length();

        int min = Math.min(lengthOfFirstSt,lengthOfSecondSt);

        String prefixSt ="";

        for (int i = 0; i <min ; i++) {
            if (firstSt.charAt(i)==secondSt.charAt(i)){
                prefixSt+=firstSt.charAt(i);

            }

        }
        System.out.println(prefixSt);
    }
}
