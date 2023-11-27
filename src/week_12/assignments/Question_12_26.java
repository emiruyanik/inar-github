package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\Questions");
        System.out.println(file.exists());

        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();

        directories.add(file);

        while (!directories.isEmpty()) {
            File firstFile = directories.remove(0);

            File[] subFiles = firstFile.listFiles();
            for (int i = 0; i < subFiles.length; i++) {
                if (subFiles[i].isDirectory()) {
                    directories.add(subFiles[i]);
                } else {
                    files.add(subFiles[i]);
                }
            }

        }
        for (int i = 0; i < files.size(); i++) {
            Scanner input = new Scanner(files.get(i));

            StringBuilder str = new StringBuilder();
            while (input.hasNext()) {
                String s1 = input.nextLine();
                if (s1.contains("Question")) {
                    String s2 = ChangeQuestion(s1);
                    str.append(s2 + "\n");
                } else {
                    str.append(s1 + "\n");
                }

            }
            PrintWriter output = new PrintWriter(files.get(i));
            output.println(str);
            output.close();


        }
    }


    public static String ChangeQuestion(String s1) {
        s1 = s1.replaceAll("Question_", "");
        String[] numbers = s1.split("_");
        String result = "Question_";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() == 1) {
                result += "0" + numbers[i];
                if (i == 0) {
                    result += "_";
                }
            } else {
                result += numbers[i];
                if (i == 0) {
                    result += "_";
                }
            }
        }

        return result;
    }
}

