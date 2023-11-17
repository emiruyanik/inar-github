package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        int answer;
        ArrayList<Integer> list = new ArrayList<>();

        do {
            System.out.print("What is " + number1 + "+" + number2 + "?");
            answer = input.nextInt();
            if (list.contains(answer)) {
                System.out.println("You already entered:" + answer);
                continue;
            } else if (answer != (number1 + number2)) {
                list.add(answer);
                System.out.print("Wrong answer. Try again ");
            }
        } while (answer != (number1 + number2));
        System.out.println("You got it!");

    }
}
