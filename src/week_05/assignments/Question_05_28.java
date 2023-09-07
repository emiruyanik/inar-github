package week_05.assignments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year:(e.g.,2012):\n");
        int year = input.nextInt();

        System.out.print("Enter first day of the year:\n");
        int day = input.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 1; i <= 12; i++) {

            System.out.printf("%s %d,%d is %s\n", months[i - 1], 1, year, days[day]);
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                day += 31;
                day = day % 7;
            } else if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    day += 29;
                    day = day % 7;
                } else {
                    day += 28;
                    day = day % 7;
                }

            } else {
                day += 30;
                day = day % 7;
            }

        }
    }
}
