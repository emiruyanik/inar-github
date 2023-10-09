package week_07.assignments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] years = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake"
                , "horse", "ship"};
        System.out.print("Enter a year:");
        int year = input.nextInt();
        System.out.println(year + " is a year of " + years[year % 12] + " in zodiac");
    }
}
