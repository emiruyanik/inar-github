package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers:");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int numb = input.nextInt();
            numbers[i] = numb;
        }
        int[] unrepeatedNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are:");
        for (int numb : unrepeatedNumbers) {

            System.out.print(numb + " ");


        }
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int[] eliminatedNumbers = new int[10];
        boolean check;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            check = true;
            int numb = numbers[i];
            for (int j = i; j > 0; j--) {
                if (numb == numbers[j - 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                eliminatedNumbers[count] = numb;
                count++;
            }

        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = eliminatedNumbers[i];
        }
        return result;
    }
}
