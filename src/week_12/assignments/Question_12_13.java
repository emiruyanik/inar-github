package week_12.assignments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src" +
                "\\week_12\\assignments\\abc2.txt");
        System.out.println(file.exists());

        int numberOfCharacters = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;

        Scanner input = new Scanner(file);
        String line = "";

        while (input.hasNext()) {
            line += input.nextLine() + "\n";
            numberOfLines++;
        }
        StringBuilder reserveLine = new StringBuilder(line);
        String[] s = line.split("[\\s\\n]+");
        numberOfWords = s.length;
        for (int i = 0; i < reserveLine.length() - 1; i++) {
            numberOfCharacters++;
        }


        System.out.println("Number of characters-->" + numberOfCharacters);
        System.out.println("Number of words-->" + numberOfWords);
        System.out.println("Number of lines-->" + numberOfLines);


    }
}
