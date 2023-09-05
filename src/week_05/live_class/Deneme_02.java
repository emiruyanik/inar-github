package week_05.live_class;

import java.util.Scanner;

public class Deneme_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfQuestions = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        int answer = -1;

        while (numberOfQuestions < 5) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            int max = Math.max(number1, number2);
            int min = Math.min(number1, number2);

            System.out.printf("What is the result of %d-%d\n", max, min);
            answer = input.nextInt();
            if (answer == max - min) {
                System.out.printf("You are correct\n");

                correctAnswers++;
                numberOfQuestions++;
            } else {
                System.out.printf("You are wrong\n%d-%d should be %d\n", max, min, max - min);

                wrongAnswers++;
                numberOfQuestions++;
            }


        }
        System.out.println("Correct count is " + correctAnswers);
    }
}