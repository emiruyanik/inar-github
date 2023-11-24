package week_12.assignments;

import java.io.File;
import java.util.ArrayList;

public class CountFilesAndDirectories {
    public static void main(String[] args) throws Exception {
        File directory = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_01");
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);

        int numberOfDirectories = 0;
        int numberOfFiles = 0;
        while (!directories.isEmpty()) {
            File firstSubFile = directories.remove(0);
            File[] subFiles = firstSubFile.listFiles();
            for (int i = 0; i < subFiles.length; i++) {
                if (subFiles[i].isFile()) {
                    numberOfFiles++;
                } else {
                    directories.add(subFiles[i]);
                    numberOfDirectories++;
                }
            }
        }
        System.out.println(numberOfDirectories);
        System.out.println(numberOfFiles);
    }
}
