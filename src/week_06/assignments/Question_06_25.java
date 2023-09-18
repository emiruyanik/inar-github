package week_06.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds:");
        long milliSeconds = input.nextLong();

        convertMillis(milliSeconds);
    }


    public static void convertMillis(long milliSeconds) {

        long totalSeconds = milliSeconds / 1000;


        long printSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;

        long printMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;



        System.out.println("Hours:minutes:seconds"+totalHours+":"+printMinutes+":"+printSeconds);
    }
}
