package week_04.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter");
        String letter = input.nextLine();

        char letterToCh = ' ';


        if (letter.length() == 1) {
            letterToCh = letter.charAt(0);


        } else {
            System.out.println(letter + " is not a letter");
            System.exit(1);
        }
        if (('A' <= letterToCh && letterToCh <= 'Z') || ('a' <= letterToCh && letterToCh <= 'z')) {
            if (letterToCh == 'A' || letterToCh == 'a' || letterToCh == 'E' || letterToCh == 'e' || letterToCh == 'I'
                    || letterToCh == 'i' || letterToCh == 'O' || letterToCh == 'o' || letterToCh == 'U' || letterToCh == 'u') {
                System.out.println(letterToCh + " is vovel");
            } else {
                System.out.println(letterToCh + " is consonant");

            }
        } else {
            System.out.println(letterToCh + " is an invalid input");
        }


    }
}
