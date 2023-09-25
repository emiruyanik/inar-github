package week_06.assignments;

public class Question_06_33 {
    public static void main(String[] args) {

        currentTimeAndDate();
    }

    public static void currentTimeAndDate() {
        currentDate();
        currentTime();


    }

    public static void currentTime() {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long printSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long printMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long printHours = totalHours % 24;

        long totalDays = totalHours / 24;

        if ((printHours + 3) % 24 <= 11) {
            if ((printHours + 3) % 12 < 10) {
                System.out.printf(" 0%d:%d:%d A.M", printHours + 3 % 24, printMinutes, printSeconds);
            } else {
                System.out.printf(" %d:%d:%d A.M", printHours + 3 % 24, printMinutes, printSeconds);
            }
        } else {
            System.out.printf(" %d:%d:%d P.M", printHours + 3 % 24, printMinutes, printSeconds);


        }


    }

    public static void currentDate() {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long printSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long printMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long printHours = totalHours % 24;

        long totalDays = totalHours / 24;
        long remainingOftotalDays = totalDays;

        int initYear = 1970;

        while (remainingOftotalDays >= 365) {
            if ((initYear % 4 == 0 && initYear % 100 != 0) || initYear % 400 == 0) {
                remainingOftotalDays -= 366;
                initYear++;
            } else {
                remainingOftotalDays -= 365;
                initYear++;
            }

        }
        int monthNumber = 0;

        while (remainingOftotalDays > 27) {
            if (monthNumber == 0 || monthNumber == 2 || monthNumber == 4 || monthNumber == 6 ||
                    monthNumber == 7 || monthNumber == 9 || monthNumber == 11) {
                remainingOftotalDays -= 31;
                monthNumber++;
            } else if (monthNumber == 1) {
                if (initYear % 4 == 0 && initYear % 100 != 0 || (initYear % 400 == 0)) {
                    remainingOftotalDays -= 29;
                    monthNumber++;
                } else {
                    remainingOftotalDays -= 28;
                    monthNumber++;
                }
            } else {
                remainingOftotalDays -= 30;
                monthNumber++;
            }
        }

        System.out.printf("Current date and time is %s %d, %d   ",monthName(monthNumber) , remainingOftotalDays + 1, initYear);
    }
    public static String monthName(int number){
        String st ="";
        switch (number){
            case 0:
                st= "January";
                break;
            case 1:
                st= "February";
            break;
            case 2:
                st= "March";
            break;
            case 3:
                st= "April";
            break;
            case 4:
                st= "May";
            break;
            case 5:
                st= "June";
            break;
            case 6:
                st= "July";
            break;
            case 7:
                st= "August";
            break;
            case 8:
                st= "September";
            break;
            case 9:
                st= "October";
            break;
            case 10:
                st= "November";
            break;
            case 11:
                st= "December";
            break;

        }
        return st;
    }
}

