package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = input.nextInt();

// if you don't make this process your code will not work!
        input.nextLine();

        System.out.println("Enter three letter of the month (with the first letter capitalized)");
        String threeLetterOfMonth = input.nextLine();

        if (!('A' <= threeLetterOfMonth.charAt(0) && threeLetterOfMonth.charAt(0) <= 'Z') || (threeLetterOfMonth.length() > 3)) {
            System.out.println("First letter must be capitalized or you have entered more than tree letter");
            System.exit(1);
        }


        if (threeLetterOfMonth.equals("Jan")) {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);
        } else if (threeLetterOfMonth.equals("Feb")) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.printf("%s %d has 29 days", threeLetterOfMonth, year);
            }
            else {
                System.out.printf("%s %d has 28 days", threeLetterOfMonth, year);
            }

        } else if (threeLetterOfMonth.equals("Mar")) {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("May")) {
            System.out.printf("%s %d has 30 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Jun")) {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Jul")) {
            System.out.printf("%s %d has 30 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Aug")) {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Sep")) {
            System.out.printf("%s %d has 30 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Oct")) {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);

        }else if (threeLetterOfMonth.equals("Nov")) {
            System.out.printf("%s %d has 30 days", threeLetterOfMonth, year);

        }else  {
            System.out.printf("%s %d has 31 days", threeLetterOfMonth, year);

        }


    }
}
