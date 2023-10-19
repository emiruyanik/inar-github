package week_08.assignments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n:");
        int n = input.nextInt();
        char[][] letters = getLetters(n);
        boolean isLatinSquare = isLatinSquare(letters);
        System.out.println((isLatinSquare) ? "The input array is latin square" : "The input array is not latin square");
    }

    public static boolean isLatinSquare(char[][] letters) {
        boolean isRowLatinSquare = isRowLatinSquare(letters);
        boolean isColumnLatinSquare = isColumnLatinSquare(letters);

        return isRowLatinSquare && isColumnLatinSquare;
    }

    public static boolean isColumnLatinSquare(char[][] letters) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                char ch = letters[j][i];
                for (int k = j + 1; k < letters.length; k++) {
                    if (ch == letters[k][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isRowLatinSquare(char[][] letters) {
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                char ch = letters[i][j];
                for (int k = j + 1; k < letters.length; k++) {
                    if (ch == letters[i][k]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static char[][] getLetters(int n) {
        Scanner input = new Scanner(System.in);
        char[][] result = new char[n][n];
        System.out.println("Enter three rows of letters separated by spaces:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                String st = input.next();
                char ch = Character.toUpperCase(st.charAt(0));
                if (ch <= 'A' + n && ch >= 'A') {
                    result[i][j] = ch;
                } else {
                    System.out.println("Wrong input:The letters must be from A to " + (char) ('A' + n));
                    System.exit(1);
                }
            }
        }
        return result;
    }
}
