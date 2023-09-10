package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
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
            System.out.printf("%s %d\n", months[i - 1], year);
            System.out.println("------------------------------");
            System.out.printf("%7s %7s %7s %7s %7s %7s %7s \n", "Sun", "Mon", "Tue"
                    , "Wed", "Thu", "Fri", "Sat");
            for (int j = 0; j < day; j++) {
                System.out.print("        ");
            }

            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                for (int j = 1; j <= 31; j++) {

                    System.out.printf("%7d ", j);

                    if ((day + j) % 7 == 0) {
                        System.out.println();
                    }

                }
            } else if (i == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                    for (int j = 1; j <= 29; j++) {

                        System.out.printf("%7d ", j);

                        if ((day + j) % 7 == 0) {
                            System.out.println();
                        }
                    }

                } else {
                    for (int j = 1; j <= 28; j++) {

                        System.out.printf("%7d ", j);

                        if ((day + j) % 7 == 0) {
                            System.out.println();
                        }
                    }
                }


            } else {
                for (int j = 1; j <= 30; j++) {

                    System.out.printf("%7d ", j);

                    if ((day + j) % 7 == 0) {
                        System.out.println();
                    }

                }
            }
            System.out.println();

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