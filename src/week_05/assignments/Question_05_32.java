package week_05.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2;

        do {
            number2 = (int) (Math.random() * 10);
        } while (number1 == number2);
        String numbers = number1 + "" + number2;


        String lotteryNumber = "";

        do {
            System.out.print("Enter your lottery number:");
            lotteryNumber = input.nextLine();
        } while (!(lotteryNumber.length() == 2 && lotteryNumber.charAt(0) <= '9'
                && lotteryNumber.charAt(1) >= '0'));

        System.out.println("The lottery number " + numbers);

        if (numbers.equals(lotteryNumber)) {
            System.out.println("You win $10000");
        } else if (numbers.charAt(0) == lotteryNumber.charAt(1) && numbers.charAt(1) == lotteryNumber.charAt(0)) {
            System.out.println("You win $3000");
        } else if (numbers.charAt(0) == lotteryNumber.charAt(1) || numbers.charAt(0) == lotteryNumber.charAt(0) ||
                numbers.charAt(1) == lotteryNumber.charAt(0) || numbers.charAt(1) == lotteryNumber.charAt(1)) {
            System.out.println("You win $1000");
        } else {
            System.out.println("You win nothing");
        }


    }
}
