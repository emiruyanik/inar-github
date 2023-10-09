package week_07.assignments;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop:");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots:");
        int numberOfSlots = input.nextInt();

        int[] coordinateOfBalls = new int[8];

        for (int i = 0; i < numberOfBalls; i++) {
            int coordinateNumber = 0;

            for (int j = 0; j < numberOfSlots - 1; j++) {
                int leftOrRight = (int) (Math.random() * 2);
                if (leftOrRight == 1) {
                    coordinateNumber++;
                    System.out.print("R");
                } else {
                    System.out.print("L");
                }


            }
            coordinateOfBalls[coordinateNumber]++;
            System.out.println();

        }
        int max = coordinateOfBalls[0];
        for (int i = 1; i < numberOfSlots; i++) {
            if (coordinateOfBalls[i] > max) {
                max = coordinateOfBalls[i];
            }

        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < numberOfSlots; j++) {

                if (coordinateOfBalls[j] >= i) {
                    System.out.print(0);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
