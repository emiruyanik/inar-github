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
        boolean result = false;
        int total1 = sumOfDoubleEvenPlace(creditCardNumber) ;
        int total2 = sumOfOddPlace(creditCardNumber) ;
        if ((total1+total2) % 10 == 0) {
            result = true;
        }
        return result;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String creditCard = number + "";
        int total = 0;

        for (int i = creditCard.length() - 1; i >= 0; i--) {

            if (i % 2 == 0) {
                int numb = Integer.parseInt(creditCard.charAt(i) + "");
                numb*=2;
                total+=getDigit(numb);
            }




        }
        return total;
    }

    public static int getDigit(int numb) {
        int result = 0;
        if (numb > 9) {
            int digit1 = numb % 10;
            int digit2 = numb / 10;
            result = digit1 + digit2;
        } else {
            result = numb;
        }
        return result;
    }

    public static int sumOfOddPlace(long number) {
        String creditCard = number + "";
        int total = 0;
        for (int i = creditCard.length() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                int numb = Integer.parseInt(creditCard.charAt(i) + "");
                total += numb;
            }
        }
        return total;
    }
}
