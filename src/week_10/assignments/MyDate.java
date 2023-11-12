package week_10.assignments;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private long totalMilliSeconds;

    MyDate() {
        totalMilliSeconds = System.currentTimeMillis();
        this.day = findTheDay(totalMilliSeconds);
        this.month = findTheMonth(totalMilliSeconds);
        this.year = findTheYear(totalMilliSeconds);
    }

    MyDate(long elapsedTime) {
        totalMilliSeconds = elapsedTime;
        this.day = findTheDay(totalMilliSeconds);
        this.month = findTheMonth(totalMilliSeconds);
        this.year = findTheYear(totalMilliSeconds);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        totalMilliSeconds = elapsedTime;
    }

    private int findTheDay(long totalMilliSeconds) {
        int totalDays = getTotalDays();
        int remainingDays = remainingDaysOfTheYear(totalDays);
        int month = 0;
        while (remainingDays >= totalDaysInTheMonth(month, totalMilliSeconds)) {
            if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
                remainingDays -= 31;
                month++;
            } else if (month == 1) {
                if (isLeapYear(findTheYear(totalMilliSeconds))) {
                    remainingDays -= 29;
                    month++;
                } else {
                    remainingDays -= 28;
                    month++;
                }
            } else {
                remainingDays -= 30;
                month++;
            }
        }
        return (remainingDays + 1);
    }

    private int findTheMonth(long totalMilliSeconds) {
        int totalDays = getTotalDays();
        int remainingDays = remainingDaysOfTheYear(totalDays);
        int month = 0;
        while (remainingDays >= totalDaysInTheMonth(month, totalMilliSeconds)) {
            if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
                remainingDays -= 31;
                month++;
            } else if (month == 1) {
                if (isLeapYear(findTheYear(totalMilliSeconds))) {
                    remainingDays -= 29;
                    month++;
                } else {
                    remainingDays -= 28;
                    month++;
                }
            } else {
                remainingDays -= 30;
                month++;
            }
        }
        return month;
    }

    private int totalDaysInTheMonth(int month, long totalMilliSeconds) {
        if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
            return 31;
        } else if (month == 1) {
            if (isLeapYear(findTheYear(totalMilliSeconds))) {
                return 29;
            } else {
                return 28;
            }

        }
        return 30;
    }

    private int remainingDaysOfTheYear(int totalDays) {
        int year = 1970;
        while (totalDays >= totalDaysInTheYear(year)) {
            if (isLeapYear(year)) {
                totalDays -= 366;
                year++;
            } else {
                totalDays -= 365;
                year++;
            }
        }
        return totalDays;
    }

    private int findTheYear(long totalMilliSeconds) {
        int totalDays = getTotalDays();
        int year = 1970;
        while (totalDays >= totalDaysInTheYear(year)) {
            if (isLeapYear(year)) {
                totalDays -= 366;
                year++;
            } else {
                totalDays -= 365;
                year++;
            }
        }
        return year;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private int totalDaysInTheYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    private long getTotalSeconds() {
        return totalMilliSeconds / 1000;
    }

    private long getTotalMinutes() {
        return getTotalSeconds() / 60;
    }

    private int getTotalHours() {
        return (int) getTotalMinutes() / 60;
    }

    private int getTotalDays() {
        return getTotalHours() / 24;
    }
}
