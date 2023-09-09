package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (it ends with input of 0):");
        int number = input.nextInt();
        int max = number;
        int counter = 0;

        while (number != 0) {

            counter++;
            number = input.nextInt();

            if (number > max) {
                counter = 0;
                max = number;
            }

            if (number < max && number != 0) {
                counter--;
            }
        }
        System.out.println("The largest count " + max + " and the occurrence of the count " + counter);

    }
}
