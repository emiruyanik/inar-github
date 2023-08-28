package week_04.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String major = " ";
        String numberCharacter = " ";

        System.out.println("Enter two characters");
        String characters = input.nextLine();

        if (characters.length() != 2) {
            System.out.println("You have entered more than two characters");
            System.exit(1);
        }
        char character1 = characters.charAt(0);
        char character2 = characters.charAt(1);

        if (character1 == 'M') {
            major = "Mathematics";
        } else if (character1 == 'C') {
            major = "Computer Science";


        } else if (character1 == 'I') {
            major = "Information Technology";

        } else {
            System.out.println("Invalid input");
            System.exit(2);
        }

        if (character2 == '1') {
            numberCharacter = "Freshman";
        } else if (character2 == '2') {
            numberCharacter = "Sophomore";
        } else if (character2 == '3') {
            numberCharacter = "Junior";
        } else if (character2 == '4') {
            numberCharacter = "Senior";
        } else {
            System.out.println("Invalid input");
            System.exit(3);


        }
        System.out.printf("%s %s", major, numberCharacter);
    }

}
