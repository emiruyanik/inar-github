package week_05.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String st = input.nextLine();

        int lengthOfSt = st.length();
        int countOfVowels = 0;
        int countOfConsonants = 0;
        for (int i = 0; i < lengthOfSt; i++) {

            if (st.charAt(i) == ' ') {
                continue;
            }

            if (st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O'
                    || st.charAt(i) == 'U' || st.charAt(i) == 'a' || st.charAt(i) == 'e'
                    || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {

                countOfVowels++;

            } else {
                countOfConsonants++;
            }
        }
        System.out.println("The number of vowels is :" + countOfVowels);
        System.out.println("The number of consonants is :" + countOfConsonants);
    }
}
