package week_12.assignments;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws Exception {
        File directory = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\text_files");
        System.out.println(directory.exists());

        ArrayList<File> directoryList = new ArrayList<>();
        directoryList.add(directory);

        ArrayList<File> files = new ArrayList<>();
        int count = 0;
        int countDirectory = 0;

        while (!directoryList.isEmpty()) {
            File f = directoryList.remove(0);
            File[] subFiles = f.listFiles();
            for (File subfile : subFiles) {
                if (subfile.isFile()) {
                    files.add(subfile);
                    count++;
                } else {
                    directoryList.add(subfile);
                    countDirectory++;
                }
            }
        }
        System.out.println(count);
        System.out.println(countDirectory);
        for (int i = 0; i < files.size(); i++) {
            Scanner input = new Scanner(files.get(i));
            String lines = "";
            while (input.hasNext()) {
                lines += input.nextLine() + "\n";
            }

            lines = lines.replaceAll("is", "was");
            PrintWriter output = new PrintWriter(files.get(i));
            output.println(lines);
            output.close();
        }
    }
}
