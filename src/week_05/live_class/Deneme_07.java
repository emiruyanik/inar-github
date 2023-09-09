package week_05.live_class;

import java.util.Scanner;

public class Deneme_07 {
    public static void main(String[] args) {

        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness.";
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < input.length() - 1; i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        System.out.println(count);
    }
}
