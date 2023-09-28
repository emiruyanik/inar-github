package week_06.assignments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer:");
        long creditCardNumber = input.nextLong();

        System.out.print(creditCardNumber);
        System.out.println((isValid(creditCardNumber)) ? " is valid" : " is not valid");
    }

    public static boolean isValid(long creditCardNumber) {
        boolean result = true;
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(creditCardNumber);
        int sumOfOddPlace = sumOfOddPlace(creditCardNumber);
        if ((sumOfOddPlace + sumOfDoubleEvenPlace) % 10 != 0) {
            return false;
        }
        if (!prefixMatched(creditCardNumber)) {
            return false;
        }
        if (!isLengthOfCreditCard(creditCardNumber)) {
            return false;
        }
        return result;

    }

    public static int sumOfDoubleEvenPlace(long creditCard) {
        String strOfCreditCaard = creditCard + "";
        int total = 0;
        for (int i = 0; i <= strOfCreditCaard.length() - 1; i += 2) {
            int digit = strOfCreditCaard.charAt(i) - '0';
            digit *= 2;
            total += getDigit(digit);
        }
        return total;
    }

    public static int getDigit(int digit) {
        if (digit > 9) {
            int numb1 = digit / 10;
            int numb2 = digit % 10;
            return numb1 + numb2;
        }
        return digit;
    }

    public static int sumOfOddPlace(long creditCard) {
        int total = 0;
        String strOfCreditCard = creditCard + "";
        for (int i = 1; i <= strOfCreditCard.length() - 1; i += 2) {
            total += strOfCreditCard.charAt(i) - '0';
        }
        return total;
    }

    public static boolean prefixMatched(long creditCard) {
        String strOfCreditCaard = creditCard + "";
        if (strOfCreditCaard.startsWith("4") || strOfCreditCaard.startsWith("37")
                || strOfCreditCaard.startsWith("5") || strOfCreditCaard.startsWith("6")) {
            return true;
        }
        return false;
    }

    public static boolean isLengthOfCreditCard(long creditCard) {
        String strOfCreditCaard = creditCard + "";
        if (strOfCreditCaard.length() >= 13 && strOfCreditCaard.length() <= 16) {
            return true;
        }
        return false;
    }
}