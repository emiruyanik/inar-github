package week_05.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String st = input.nextLine();

        int lengthOfSt = st.length();

        int uppercaseLetters = 0;
        for (int i = 0; i < lengthOfSt; i++) {
            char ch = st.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercaseLetters++;
            }
        }

        System.out.println("The number of uppercase letters is:"+uppercaseLetters);
    }
}
