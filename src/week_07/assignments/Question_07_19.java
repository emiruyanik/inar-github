package week_07.assignments;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of list:");
        int sizeOfList = input.nextInt();

        System.out.print("Enter the list:");
        int[] numbers = new int[sizeOfList];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println((isSorted(numbers)) ? "is sorted" : "is not sorted");
    }

    public static boolean isSorted(int[] numbers) {
        int[] duplicatedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            duplicatedNumbers[i] = numbers[i];
        }
        int[] sortedNumbers = sorted(duplicatedNumbers);

        return java.util.Arrays.equals(duplicatedNumbers, numbers);
    }

    public static int[] sorted(int[] duplicatedNumbers) {
        for (int i = 0; i < duplicatedNumbers.length; i++) {
            int currentMin = duplicatedNumbers[i];
            int currentIndex = i;

            for (int j = i + 1; j < duplicatedNumbers.length; j++) {
                if (duplicatedNumbers[j] < currentMin) {
                    currentMin = duplicatedNumbers[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                duplicatedNumbers[currentIndex] = duplicatedNumbers[i];
                duplicatedNumbers[i] = currentMin;
            }
        }
        return duplicatedNumbers;
    }
}
