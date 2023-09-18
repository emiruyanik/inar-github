package week_06.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String st = input.nextLine();
        String newSt = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = Character.toUpperCase(st.charAt(i));
            if (Character.isLetter(ch)) {
                int letterToNumber = getNumber(ch);
                newSt += letterToNumber;
            }else {
                newSt+=ch+"";
            }

        }
        System.out.println(newSt);
    }

    public static int getNumber(char ch) {

        if (ch == 'A' || ch == 'B' || ch == 'C') {
            return 2;
        } else if (ch == 'D' || ch == 'E' || ch == 'F') {
            return 3;
        } else if (ch == 'G' || ch == 'H' || ch == 'I') {
            return 4;
        } else if (ch == 'J' || ch == 'K' || ch == 'L') {
            return 5;
        } else if (ch == 'M' || ch == 'N' || ch == 'O') {
            return 6;
        } else if (ch == 'P' || ch == 'R' || ch == 'S') {
            return 7;
        } else if (ch == 'T' || ch == 'U' || ch == 'V') {
            return 8;
        } else {
            return 9;
        }

    }
}


