package week_03.assignments;


import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:(e.g 2012)");
        int year = input.nextInt();

        System.out.println("Enter month:1-12");
        int month = input.nextInt();

        System.out.println("Enter the day of month:1-31");
        int day = input.nextInt();

        int h = 0;
        int k = year%100;
        int j = year/100;
        int q = day;

        if ((12>=month && month>=1) && (31>=day && day>=1)){
            if (month==1||month==2){
                month+=12;
                year-=1;
                k=year%100;
                j=year/100;
            }
            h =(q+((26*(month+1))/10)+k+(k/4)+(j/4)+(5*j))%7;
        }

            switch (h){
                case 0:
                    System.out.println("Day of the week : Saturday");
                    break;
                case 1:
                    System.out.println("Day of the week : Sunday");
                    break;
                case 2:
                    System.out.println("Day of the week : Monday");
                    break;
                case 3:
                    System.out.println("Day of the week : Tuesday");
                    break;
                case 4:
                    System.out.println("Day of the week : Wednesday");
                    break;
                case 5:
                    System.out.println("Day of the week : Thursday");
                    break;
                case 6:
                    System.out.println("Day of the week :2015" +
                            "1" +
                            " Friday");
                    break;

            }



    }
}
