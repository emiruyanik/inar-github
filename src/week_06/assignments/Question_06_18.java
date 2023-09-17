package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the password:");
        String password = input.nextLine();

        System.out.println(validPassword(password) ? "True password" : "Invalid password");
    }

    public static boolean validPassword(String password) {
        boolean result = true;
        if (!(atLeastEightCharacter(password))) {
            result = false;

        }
        if (!(consistsOfOnlyLettersAndNumbers(password))) {
            result = false;
        }
        if (!(atLeastTwoDigits(password))) {
            result = false;
        }
        return result;
    }

    public static boolean atLeastEightCharacter(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean consistsOfOnlyLettersAndNumbers(String password) {
        boolean result = true;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!(Character.isDigit(ch) || Character.isLetter(ch))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean atLeastTwoDigits(String password) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                counter++;
            }
            if (counter >= 2) {
                result = true;
                break;
            }

        }
        return result;
    }
}
