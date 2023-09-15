package week_06.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int numb = input.nextInt();

        System.out.println(( isPalindrome(numb))?+numb+" is palindrome":+numb+" is not palindrome");

    }

    public static boolean isPalindrome(int numb) {
        if (numb == reverse(numb)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverse(int numb) {
        String digits = numb + "";
        String reverseOfNumb = "";
        for (int i = digits.length(); i > 0; i--) {
            reverseOfNumb += digits.charAt(i - 1);
        }
        int reverseNumb = Integer.parseInt(reverseOfNumb);
        return reverseNumb;
    }
}
