package week_12.assignments;

import java.util.Scanner;

public class Question_12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean check = true;
        do {
            System.out.print("Enter a hex value:");
            String str = input.nextLine();
            str = str.toUpperCase();
            try {
                int result = hexToDecimal(str);
                System.out.println("Hex value is-->" + result);
                check = false;
            } catch (NumberFormatException ex) {
                System.out.println("You have entered invalid value!");
            }
        } while (check);

    }

    public static int hexToDecimal(String str) throws NumberFormatException {
        int result = 0;
        int pow = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i) >= (int) 'A' && (int) str.charAt(i) <= (int) 'F') ||
                    ((int) str.charAt(i) >= (int) '0' && (int) str.charAt(i) <= (int) '9')) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    int chValue = ((int) ch) - 55;
                    int powValue = (int) Math.pow(16, pow);
                    result += powValue * chValue;
                    pow--;

                } else {
                    int chValue = ((int) ch) - 48;
                    int powValue = (int) Math.pow(16, pow);
                    result += powValue * chValue;
                    pow--;
                }
            } else {
                throw new NumberFormatException();
            }
        }
        return result;
    }

}