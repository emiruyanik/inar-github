package week_04.assignments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("You have entered more than one letter");
            System.exit(1);
        }
        char letterToCh = letter.charAt(0);
        if (('A' <= letterToCh && letterToCh <= 'Z') || ('a' <= letterToCh && letterToCh <= 'z')) {
            if (letterToCh == 'A' || letterToCh == 'a' || letterToCh == 'B' || letterToCh == 'b' ||
                    letterToCh == 'C' || letterToCh == 'c') {
                System.out.println("The corresponding number is 2");
            } else if (letterToCh == 'D' || letterToCh == 'd' || letterToCh == 'E' || letterToCh == 'e' ||
                    letterToCh == 'F' || letterToCh == 'f') {
                System.out.println("The corresponding number is 3");

            } else if (letterToCh == 'G' || letterToCh == 'g' || letterToCh == 'H' || letterToCh == 'h' ||
                    letterToCh == 'I' || letterToCh == 'i') {
                System.out.println("The corresponding number is 4");

            } else if (letterToCh == 'J' || letterToCh == 'j' || letterToCh == 'K' || letterToCh == 'k' ||
                    letterToCh == 'L' || letterToCh == 'l') {
                System.out.println("The corresponding number is 5");


            }
            else if (letterToCh == 'M' || letterToCh == 'm' || letterToCh == 'N' || letterToCh == 'n' ||
                    letterToCh == 'O' || letterToCh == 'o') {
                System.out.println("The corresponding number is 6");
            }
            else if (letterToCh == 'P' || letterToCh == 'p' || letterToCh == 'R' || letterToCh == 'r' ||
                    letterToCh == 'S' || letterToCh == 's') {
                System.out.println("The corresponding number is 7");
            }
            else if (letterToCh == 'T' || letterToCh == 't' || letterToCh == 'U' || letterToCh == 'u' ||
                    letterToCh == 'V' || letterToCh == 'v') {
                System.out.println("The corresponding number is 8");
            }
            else  {
                System.out.println("The corresponding number is 9");
            }
        }else {
            System.out.println(letterToCh+" is an invalid input");
        }
    }
}
