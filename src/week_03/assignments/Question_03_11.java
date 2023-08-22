package week_03.assignments;

import java.util.Scanner;

public class Question_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month as integer");
        int month = input.nextInt();
        int year = 0;

        if (month <= 12 && month >= 1) {
            System.out.println("Enter the year as integer");
            year = input.nextInt();
            switch (month % 12) {
                case 1:
                    System.out.println("January "+year+" had "+ +31);
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.println("February "+year+" had "+ +29);
                    } else {
                        System.out.println("February "+year+" had "+ +28);

                    }
                    break;
                case 3:
                    System.out.println("March "+year+" had "+ +31);
                    break;
                case 4:
                    System.out.println("April "+year+" had "+ +30);
                    break;
                case 5:
                    System.out.println("May "+year+" had "+ +31);
                    break;
                case 6:
                    System.out.println("June "+year+" had "+ +30);
                    break;
                case 7:
                    System.out.println("July "+year+" had "+ +31);
                    break;
                case 8:
                    System.out.println("August "+year+" had "+ +30);
                    break;
                case 9:
                    System.out.println("September "+year+" had "+ +31);
                    break;
                case 10:
                    System.out.println("October "+year+" had "+ +30);
                    break;
                case 11:
                    System.out.println("November "+year+" had "+ +31);
                    break;
                case 0:
                    System.out.println("December "+year+" had "+ +30);
                    break;

            }
        } else {
            System.out.println("İncorrect month value");
        }
    }
}
