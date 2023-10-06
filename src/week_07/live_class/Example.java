package week_07.live_class;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = input.nextLine();
        int totalLetters = 'z' - 'a' + 1;
        int[] countOfLetters = new int[totalLetters];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                System.out.println(ch);
                countOfLetters[ch - 'a']++;
            }
        }
        for (int i = 0; i < countOfLetters.length; i++) {
            if (countOfLetters[i] > 0) {
                System.out.println((char) (i + 'a') + " : " + countOfLetters[i]);
            }
        }
    }
}
