package week_07.assignments;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of values:");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        int[] partitionNumbers = partition(numbers);
        for (int numb : partitionNumbers) {
            System.out.print(numb + " ");
        }
    }

    public static int[] partition(int[] numbers) {
        int[] result = new int[numbers.length];
        int partitionNumb = numbers[0];
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (partitionNumb > numbers[i]) {
                result[count] = numbers[i];
                count++;
            }
        }
        result[count] = partitionNumb;
        count++;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > partitionNumb) {
                result[count] = numbers[i];
                count++;
            }
        }
        return result;
    }
}
