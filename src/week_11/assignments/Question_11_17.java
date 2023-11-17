package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");

        int number = input.nextInt();
        int realNumber = number;

        ArrayList<Integer> smallestFactors = new ArrayList<>();
        while (number != 1) {
            for (int i = 2; i <= realNumber; i++) {
                if (number % i == 0) {
                    smallestFactors.add(i);
                    number /= i;
                }
            }

        }
        int minIndexNumber = (int) (realNumber / 2);
        int[] timesOfFactors = new int[minIndexNumber];
        for (int i = 0; i < smallestFactors.size(); i++) {

            timesOfFactors[smallestFactors.get(i)]++;
        }
        ArrayList<Integer> smallestNumbersForPerfectSquare = new ArrayList<>();
        for (int i = 0; i < timesOfFactors.length; i++) {
            if (timesOfFactors[i] % 2 == 0) {
                continue;
            } else {
                smallestNumbersForPerfectSquare.add(i);
            }
        }
        int minForPerfectSqr = 1;
        for (int i = 0; i < smallestNumbersForPerfectSquare.size(); i++) {
            minForPerfectSqr *= smallestNumbersForPerfectSquare.get(i);
        }
        System.out.println("The smallest number n for m * n to be a perfect square is " + minForPerfectSqr);
        System.out.println("m*n=" + realNumber * minForPerfectSqr);

    }
}