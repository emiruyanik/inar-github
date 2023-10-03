package week_07.assignments;

import java.util.Scanner;

import static week_07.assignments.Question_07_07.randomNumbers;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers to exclude from random(1-54)");
        int[] excludingNumbers = new int[10];

        for (int i = 0; i < excludingNumbers.length; i++) {
            int numb = input.nextInt();
            excludingNumbers[i] = numb;
        }


        int randomNumber = getRandom(excludingNumbers);
        System.out.println("Number generated " + randomNumber);
    }

    public static int getRandom(int[] excludingNumbers) {
        boolean isExcluded;
        int randomNumb;
        do {
            randomNumb = (int) ((Math.random() * 54) + 1);
            isExcluded = true;

            for (int excludingNumber : excludingNumbers) {
                if (randomNumb == excludingNumber) {
                    isExcluded = false;
                    break;
                }
            }


        } while (!isExcluded);

        return randomNumb;
    }


}
