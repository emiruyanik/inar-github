package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\" +
                "week_12\\assignments\\sortedString.txt");

        Scanner input = new Scanner(file);

        String line = "";
        while (input.hasNext()) {
            line += input.nextLine();
        }
        String[] array = line.split("[\\n\\s]+");
        boolean isSorted = isSorted(array);
        if (!isSorted) {
            System.out.println("The strings " + array[0] + " " + array[1] + " out of order");
        }

    }

    public static boolean isSorted(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String str1 = array[i];
            for (int j = i + 1; j < array.length; j++) {
                String str2 = array[j];
                int minIndex = Math.min(str1.length(), str2.length());
                for (int k = 0; k < minIndex; k++) {
                    char chOfStr1 = str1.charAt(k);
                    char chOfStr2 = str2.charAt(k);
                    if (Character.compare(chOfStr1, chOfStr2) != -1) {
                        return false;
                    }

                }
            }
        }
        return true;
    }
}
