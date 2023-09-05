package week_05.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int QUESTION_OF_NUMBERS = 10;
        int counter = 0;
        String s1 = "";
        int correctCounter = 0;
        int wrongCounter = 0;


        while (QUESTION_OF_NUMBERS > counter) {
            int number1 = (int) (Math.random() * 15 + 1);
            int number2 = (int) (Math.random() * 15 + 1);

            System.out.printf("What is the result of %d + %d ?\n", number1, number2);
            int answer = input.nextInt();

            if (answer == number1 + number2) {
                System.out.println("You got it !");
                correctCounter++;

            } else {
                System.out.printf("Wrong answer it should be %d\n", (number1 + number2));
                wrongCounter++;
            }
            s1 =s1 + number1 + "+" + number2 + "=" + answer + ((number1 + number2 == answer ? " correct" : " wrong")) + "\n";
            counter++;

        }
        System.out.println("Correct answer is " + correctCounter);
        System.out.println("Wrong answer is " +wrongCounter);
        System.out.println("\n" + s1);
    }
}
