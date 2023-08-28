package week_04.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN");
        String ssd = input.nextLine();

        if (ssd.length() != 11) {
            System.out.println("You  entered incorrect value ");
            System.exit(1);
        }

        if ((ssd.charAt(0) <= '9' && ssd.charAt(0) >= '0') && (ssd.charAt(1) <= '9' && ssd.charAt(1) >= '0') &&
                (ssd.charAt(2) <= '9' && ssd.charAt(2) >= '0') && ssd.charAt(3) == '-' &&
                (ssd.charAt(4) <= '9' && ssd.charAt(4) >= '0') && (ssd.charAt(5) <= '9' && ssd.charAt(5) >= '0')
                && ssd.charAt(6) == '-' &&
                (ssd.charAt(7) <= '9' && ssd.charAt(7) >= '0') && (ssd.charAt(8) <= '9' && ssd.charAt(8) >= '0') &&
                (ssd.charAt(9) <= '9' && ssd.charAt(9) >= '0') && (ssd.charAt(10) <= '9' && ssd.charAt(10) >= '0')) {
            System.out.println(ssd + " is a valid social security number");

        } else {
            System.out.println(ssd + " is an invalid social security number");
        }

    }
}
