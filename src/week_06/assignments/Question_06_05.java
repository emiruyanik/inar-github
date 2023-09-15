package week_06.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers:");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumber(num1, num2, num3);
    }

    public static void displaySortedNumber(double num1, double num2, double num3) {
        double max;
        double mid;
        double min;

        if (num1 > Math.max(num2, num3)) {
            max = num1;
            if (num2 > num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        } else if (num2 > Math.max(num1, num3)) {
            max = num2;
            if (num1 > num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }

        } else {
            max = num3;
            if (num1 > num2) {
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }
        System.out.printf("%.1f %.1f %.1f",max,mid,min);
    }
}
