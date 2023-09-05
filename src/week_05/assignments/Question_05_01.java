package week_05.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int average = 0;
        int total = 0;
        int number;

        System.out.println("Enter an integer, the input ends if it is 0:");


        do {
            number = input.nextInt();
            total += number;

            if (number > 0) {
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            }

        } while (number != 0);

        if (total != 0) {
            System.out.printf("The number of positives %d\n", positiveNumbers);
            System.out.printf("The number of negatives %d\n", negativeNumbers);
            System.out.printf("The total is %d\n", total);
            System.out.printf("The average is %.2f\n", (float) (total) / (positiveNumbers + negativeNumbers));

        } else {
            System.out.println("No numbers are entered except 0");
        }


    }
}

