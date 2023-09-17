package week_06.assignments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String st = input.nextLine();

        int numberOfLetters = countLetters(st);
        System.out.printf("The number of letters in the string \" %s \" : %d ", st, numberOfLetters);
    }

    public static int countLetters(String st) {
        int counter = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isLetter(ch)) {
                counter++;
            }
        }
        return counter;
    }
}
