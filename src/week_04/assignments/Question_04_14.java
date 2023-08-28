package week_04.assignments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade");
        String gradeLetter = input.nextLine();
        char toCh = ' ';

        if (gradeLetter.length() == 1) {
            toCh = gradeLetter.charAt(0);
        } else {
            System.out.println(gradeLetter + " is not grade letter");
            System.exit(1);
        }
        if (toCh == 'A' || toCh == 'B' || toCh == 'C' || toCh == 'D' || toCh == 'F') {
            if (toCh == 'A') {
                System.out.println("The numeric value for grade A is 4");
            } else if (toCh == 'B') {
                System.out.println("The numeric value for grade B is 3");
            } else if (toCh == 'C') {
                System.out.println("The numeric value for grade C is 2");
            } else if (toCh == 'D') {
                System.out.println("The numeric value for grade D is 1");
            } else {
                System.out.println("The numeric value for grade F is 0");
            }
        }
        else {
            System.out.println(toCh+" is an invalid grade");
        }
    }
}
