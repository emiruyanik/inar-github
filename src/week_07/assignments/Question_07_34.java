package week_07.assignments;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to sort:");
        String str = input.nextLine();
        str=str.toLowerCase();
        String sortedStr = sort(str);
        System.out.println(sortedStr);


    }

    public static String sort(String str) {
        int[] letters = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            letters[i] = (int) (ch);
        }
        sort(letters);
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            result += (char) letters[i] ;
        }
        return result;
    }

    public static void sort(int[] letters) {
        for (int i = 0; i < letters.length - 1; i++) {
            int currentMin = letters[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < letters.length; j++) {
                if (currentMin > letters[j]) {
                    currentMin = letters[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                letters[currentMinIndex] = letters[i];
                letters[i] = currentMin;
            }
        }
    }
}
