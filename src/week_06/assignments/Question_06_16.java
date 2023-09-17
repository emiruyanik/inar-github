package week_06.assignments;

import java.util.Scanner;

public class Question_06_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-11s %4s\n", "Year", "Days in year");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-11d %4d\n", i, numberOfYearsInYear(i));
        }
    }

    public static int numberOfYearsInYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }
}
