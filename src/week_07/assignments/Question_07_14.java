package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            int numb = input.nextInt();
            numbers[i] = numb;

        }
        int gcd = gcd(numbers);
        System.out.println("The greatest common divisor is " + gcd);
    }

    public static int gcd(int... numbers) {
        int min = min(numbers);
        int max = max(numbers);
        int gcd = 1;
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % i != 0) {
                    break;
                } else {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

}
