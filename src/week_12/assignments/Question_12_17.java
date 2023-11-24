package week_12.assignments;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\" +
                "src\\week_12\\assignments\\abc.txt");
        Scanner wordsInTheText = new Scanner(file);

        String str = "";
        while (wordsInTheText.hasNext()) {
            str += wordsInTheText.nextLine() + "\n";
        }
        String[] words = str.split("[\\n\\s,;:]+");
        int maxIndex = words.length;
        System.out.println(maxIndex);
        String control;
        char yesOrNo;
        do {
            String randomStr = randomStr(words, maxIndex);
            int differentLetters = numberOfDifferentLetters(randomStr);

            String[] letters = new String[randomStr.length()];
            for (int i = 0; i < letters.length; i++) {
                letters[i] = randomStr.charAt(i) + "";
            }

            System.out.print("Enter a letter in word ");
            String[] array = new String[randomStr.length()];
            Arrays.fill(array, "*");
            int wrongAnswers = 0;
            do {
                System.out.print("Enter a letter in word ");
                System.out.print(Arrays.toString(array));

                String ch = input.nextLine();
                ch = ch.toLowerCase();
                ch = ch.charAt(0) + "";

                int index = -1;
                int[] indexes = new int[letters.length];
                int count = 0;
                boolean check = true;

                for (int i = 0; i < letters.length; i++) {
                    if (ch.equals(array[i])) {
                        check = false;
                        index = -2;
                        break;
                    }
                }

                if (check) {
                    for (int i = 0; i < letters.length; i++) {
                        if (ch.equals(letters[i])) {
                            index = i;
                            indexes[count] = index;
                            count++;
                            differentLetters--;
                        }
                    }
                }
                if (index >= 0) {
                    for (int i = 0; i < count; i++) {
                        array[indexes[i]] = ch;
                    }
                } else if (index == -1) {
                    System.out.println(ch + " is not in the word");
                    wrongAnswers++;
                } else {
                    System.out.println(ch + " is already in the word");
                }
            } while (differentLetters != 0);
            System.out.println("The word is:" + Arrays.toString(array));
            System.out.println("you missed " + wrongAnswers + " time");
            System.out.println("Do you want to guess another word:");
            control = input.nextLine();
            control = control.toLowerCase();
            yesOrNo = control.charAt(0);
        } while (yesOrNo == 'y');


    }

    public static void printAsteriks(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.print(" >");
    }

    public static int numberOfDifferentLetters(String randomStr) {
        String[] chars = new String[randomStr.length()];
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            String str = "";
            str += randomStr.charAt(i);
            boolean check = true;
            for (int j = i; j > 0; j--) {
                if (str.equals(chars[j])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                chars[i] = str;
                result++;
            }
        }
        return result;
    }

    public static String randomStr(String[] words, int maxIndex) {
        int randomIndex = (int) (Math.random() * maxIndex);
        return words[randomIndex].toLowerCase();
    }
}


