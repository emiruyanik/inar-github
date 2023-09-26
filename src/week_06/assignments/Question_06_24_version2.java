package week_06.assignments;

public class Question_06_24_version2 {
    public static void main(String[] args) {
        printCurrentTimeAndDate();
    }

    public static void printCurrentTimeAndDate() {
        long totalMilliSeconds = System.currentTimeMillis();
        long printSeconds = getTotalSeconds(totalMilliSeconds) % 60;
        long printMinutes = getTotalMinutes(totalMilliSeconds) % 60;
        long printHours = getTotalHours(totalMilliSeconds) % 24;

        long totalDays = getTotalDays(totalMilliSeconds);
        int initYear = 1970;
        int currentYear = getTheCurrentYear(initYear, totalMilliSeconds);
        int remainingDaysOfTheYear = getTheRemainingDaysOfTheYear(totalMilliSeconds);
        int currentMonth = getTheCurrentMonth(remainingDaysOfTheYear, currentYear);
        int currentDay = getTheCurrentDay(remainingDaysOfTheYear, currentYear);

        System.out.printf("current time and date is: %d:%d:%d  %d  /  %d  /%d", printHours, printMinutes, printSeconds
                , currentDay, currentMonth, currentYear);

    }

    public static long getTotalSeconds(long totalMilliSeconds) {
        return totalMilliSeconds / 1000;
    }

    public static long getTotalMinutes(long totalMilliSeconds) {
        return getTotalSeconds(totalMilliSeconds) / 60;
    }

    public static long getTotalHours(long totalMilliSeconds) {
        return getTotalMinutes(totalMilliSeconds) / 60;
    }

    public static long getTotalDays(long totalMilliSeconds) {
        return getTotalHours(totalMilliSeconds) / 24;
    }

    public static int getTotalDaysInTheYear(int year) {
        int result = 0;
        if (isLeapYear(year)) {
            result = 366;
        } else {
            result = 365;
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

    public static int getTheCurrentYear(int initYear, long totalMilliSeconds) {
        int currentYear = initYear;
        long totalDays = getTotalDays(totalMilliSeconds);
        while (totalDays >= getTotalDaysInTheYear(currentYear)) {
            if (isLeapYear(currentYear)) {
                totalDays -= 366;
                currentYear++;
            } else {
                totalDays -= 365;
                currentYear++;
            }

        }
        return currentYear;
    }

    public static int getTheRemainingDaysOfTheYear(long totalMilliSeconds) {
        long totalDays = getTotalDays(totalMilliSeconds);
        int initYear = 1970;
        int currentYear = getTheCurrentYear(initYear, totalMilliSeconds);
        for (int i = initYear; i < currentYear; i++) {
            if (isLeapYear(i)) {
                totalDays -= 366;
            } else {
                totalDays -= 365;
            }
        }
        return (int) totalDays;
    }

    public static int getTheCurrentMonth(int remainingDays, int currentYear) {
        int month = 1;
        while (remainingDays > totalDaysInTheMonth(month, currentYear)) {
            remainingDays = remainingDays - totalDaysInTheMonth(month, currentYear);
            month++;

        }
        return month;
    }

    public static int totalDaysInTheMonth(int month, int year) {
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

    public static int getTheCurrentDay(int remainingDaysOfTheYear, int currentYear) {
        int month = 1;
        while (remainingDaysOfTheYear > totalDaysInTheMonth(month, currentYear)) {
            remainingDaysOfTheYear = remainingDaysOfTheYear - totalDaysInTheMonth(month, currentYear);
            month++;
        }
        return remainingDaysOfTheYear + 1;
    }
}
