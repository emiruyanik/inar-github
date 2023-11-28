package week_12.assignments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src" +
                "\\week_12\\assignments\\babynamerankings");
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
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                , "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        int year = 2001;
        for (int i = 0; i < files.size(); i++) {
            String lines = "";

            Scanner input = new Scanner(files.get(i));
            for (int j = 0; j < 10; j++) {
                lines += input.nextLine() + "\n";
            }
            String[] rankAndNames = lines.split("[\\n\\s]+");

            String[][] names = new String[10][2];
            int begin = 0;
            for (int j = 1; j <= 28; j += 3) {
                names[begin][0] = rankAndNames[j];
                names[begin][1] = rankAndNames[j + 1];
                begin++;
            }
            System.out.printf("%-10d %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                    , year, names[0][0], names[1][0], names[2][0], names[3][0], names[4][0], names[0][1]
                    , names[1][1], names[2][1], names[3][1], names[4][1]);
            year++;

        }
    }
}
