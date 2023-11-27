package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src" +
                "\\week_12\\assignments\\abc2.txt");
        System.out.println(file.exists());
        int[] array = new int[26];

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String str = input.next();
            str = str.toLowerCase();
            str=str.replaceAll("ı","i");

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);
                if (ch>='a'&&ch<='z'){
                    array[ ch - 'a']++;
                }

            }
        }
        input.close();
        for (int i = 0; i < array.length; i++) {
            System.out.println((char) (97+i)+"-->"+array[i]);
        }

    }
}
