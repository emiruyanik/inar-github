package week_06.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String st1 = input.nextLine();

        System.out.print("Enter a character that you want:");
        String st2 = input.nextLine();

        char ch = st2.charAt(0);
        System.out.println(count(st1, ch));
    }

    public static int count(String s1, char ch) {
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch) {
                result++;
            }
        }
        return result;
    }
}
