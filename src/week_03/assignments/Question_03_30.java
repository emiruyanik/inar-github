package week_03.assignments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT");
        int gmt = input.nextInt();

        long time = System.currentTimeMillis();
        long totalSeconds = time / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        if (currentHour + gmt >= 12 && currentHour + gmt <= 23) {
            System.out.println("The current time is  " + ((currentHour + gmt) % 24) + ":" + currentMinutes + ":" + currentSeconds + " PM");
        } else {
            if (currentHour + gmt < 10) {
                System.out.println("The current time is  " + "0" + ((currentHour + gmt) % 24) + ":" + currentMinutes + ":" + currentSeconds + " AM");
            } else {
                System.out.println("The current time is  " + ((currentHour + gmt) % 24) + ":" + currentMinutes + ":" + currentSeconds + " AM");
            }
        }


    }
}
