package week_12.assignments;

import java.util.Scanner;

public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean check = true;
        do {
            System.out.print("Enter a binary number:");
            String binaryString = input.nextLine();
            try {
                int result = bind2Dec(binaryString);
                check = false;
                System.out.println("The decimal value for binary number-->" + result);
            } catch (BinaryFormatException ex) {
                System.out.println(ex.getMessage());

            }
        } while (check);
    }

    public static int bind2Dec(String binaryString) throws BinaryFormatException {
        int result = 0;
        int pow = binaryString.length() - 1;
        for (int i = 0; i < binaryString.length(); i++) {
            int number = Integer.parseInt(binaryString.charAt(i) + "");
            if (number == 0 || number == 1) {
                int powOfNumber = (int) Math.pow(2, pow);
                result += number * powOfNumber;
                pow--;
            } else {
                throw new BinaryFormatException(binaryString);
            }
        }
        return result;
    }

}
