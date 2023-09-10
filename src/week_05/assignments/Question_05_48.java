package week_05.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String st = input.nextLine();

        int lengthOfSt = st.length();
        String newSt = "";
        for (int i = 0; i < lengthOfSt; i++) {
            if (i % 2 == 0) {
                newSt += st.charAt(i);

            }
        }

        System.out.println(newSt);

    }
}
