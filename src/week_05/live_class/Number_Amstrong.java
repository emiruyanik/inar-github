package week_05.live_class;

import java.util.Scanner;

public class Number_Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        String number = input.nextLine();

        int stNumberLength = number.length();

        int total = 0;

        for (int i = 0; i < stNumberLength; i++) {
            int number1 = Integer.parseInt(number.charAt(i) + "");
            int multi = (int) Math.pow(number1, stNumberLength);
            total+=multi;
        }
        String numbers=total+"";
        if (numbers.equals(number)){
            System.out.println("The number is amstrong");
        }else {
            System.out.println("The number is not amstrong");
        }
    }

}
