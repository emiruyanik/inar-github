package week_04.assignments;

import java.util.Scanner;

public class Question_04_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 =
                "1  3  5   7\n" +
                        "9 11 13  15 \n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31\n";

        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8 9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        System.out.printf("Is your birthday in Set1?\n%s ", set1);
        System.out.printf("\nEnter \'N\' for no \'Y\' for yes:");

        if (input.next().charAt(0) == 'Y') {
            day = day + 1;
        }
        System.out.printf("\nIs your birthday in Set2?\n%s", set2);
        System.out.printf("\nEnter \'N\' for no \'Y\' for yes:");

        if (input.next().charAt(0) == 'Y') {
            day = day + 2;
        }
        System.out.printf("\nIs your birthday in Set3?\n%s",set3);
        System.out.printf("\nEnter \'N\' for no \'Y\' for yes:");

        if (input.next().charAt(0) == 'Y') {
            day = day + 4;
        }
        System.out.printf("\nIs your birthday in Set4?\n%s",set4);
        System.out.printf("\nEnter \'N\' for no \'Y\' for yes:");

        if (input.next().charAt(0) == 'Y') {
            day = day + 8;
        }
        System.out.printf("\nIs your birthday in Set5?\n%s",set5);
        System.out.printf("\nEnter \'N\' for no \'Y\' for yes:");

        if (input.next().charAt(0) == 'Y') {
            day = day + 16;
        }
        System.out.printf("\nYour birthday is %d",day);
    }
}
