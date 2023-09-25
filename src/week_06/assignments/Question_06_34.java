package week_06.assignments;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year:");
        int year = input.nextInt();

        System.out.print("Enter the month as a number between 1 and 12:");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        System.out.printf("%20s %8d\n", getMonthName(month), year);
        System.out.print("______________________________________\n");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        int initDay = (startOfTheDay(year, month) + 6) % 7;
        for (int i = 0; i < initDay; i++) {
            System.out.print("      ");
        }
        for (int i = 1; i <= totalDaysInMonth(month, year); i++) {
            if ((initDay + i) % 7 == 0) {
                System.out.printf("%-6d\n", i);
            } else {
                System.out.printf("%-6d", i);
            }

        }
    }

    public static int totalDaysInMonth(int month, int year) {
        int result = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            result = 31;

        } else if (month == 2) {
            if (isLeapYear(year)) {
                result = 29;
            } else {
                result = 28;
            }
        } else {
            result = 30;
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
            result = true;
        }
        return result;
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;

        }
        return monthName;
    }

    public static int startOfTheDay(int year, int month) {
        double q = 1;
        double m = month;
        int y = year;
        if (month == 1 || month == 2) {
            m += 12;
            y--;
        }
        double k = getTheYearOfTheCentury(y);
        double j = getTheCentury(y);

        double result = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (int) result;
    }

    public static int getTheYearOfTheCentury(int year) {
        return year % 100;
    }

    public static int getTheCentury(int year) {
        return year / 100;
    }
}


