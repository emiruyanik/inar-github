package week_13.assignments;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Question_13_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year:");
        int year = input.nextInt();

        System.out.print("Enter the month:");
        int month = input.nextInt();
        month--;
        Calendar calendar = new GregorianCalendar(year, month, 1);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October" ,
                "November", "December"};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.printf("%20d %10s\n", year, months[month]);
        System.out.println("______________________________________");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", days[0], days[1], days[2], days[3],
                days[4], days[5], days[6]);

        int totalDays = 0;
        if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
            totalDays = 31;
        } else if (month == 1) {
            if (LocalDate.ofYearDay(year, 1).isLeapYear()) {
                totalDays = 29;
            } else {
                totalDays = 28;
            }

        } else {
            totalDays = 30;
        }
        for (int i = 0; i <startDay ; i++) {
            System.out.print("      ");
        }
        for (int i = 1; i <=totalDays ; i++) {

            if ((startDay+i)%7==0&&startDay!=1){
                System.out.printf("%-6d\n",i);
            }else {
                System.out.printf("%-6d",i);
            }

        }
    }
}
