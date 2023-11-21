package week_12.assignments;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        createRandomArray(array);
        boolean check = true;
        do {
            try {
                System.out.print("Enter the index of the array:");
                int index = input.nextInt();
                System.out.println("You choose:" + array[index]);
                check = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of bonds! Try again:");
                input.nextLine();
            }
        } while (check);


    }

    public static void createRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}
