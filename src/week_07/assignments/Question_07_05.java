package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers:");
        int[] numbers = new int[10];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int numb = input.nextInt();
            boolean check = true;
            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] == numb) {
                    check = false;
                    break;
                }
            }
            if (check) {
                numbers[i] = numb;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        for (int numb : numbers) {
            if (numb > 0) {
                System.out.print(numb + " ");
            }
        }
    }
}
