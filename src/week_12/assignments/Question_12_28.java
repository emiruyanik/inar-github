package week_12.assignments;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_28 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_13");

        ArrayList<File> directories = new ArrayList<>();
        ArrayList<File> files = new ArrayList<>();

        directories.add(file);
        while (!directories.isEmpty()) {
            File firstFile = directories.remove(0);
            File[] subFiles = firstFile.listFiles();
            for (int i = 0; i < subFiles.length; i++) {
                if (subFiles[i].isFile()) {
                    files.add(subFiles[i]);
                } else {
                    directories.add(subFiles[i]);
                }
            }
        }
        for (int i = 0; i < files.size(); i++) {
            String pathName = files.get(i).getAbsolutePath();
            String[] dividedPath = pathName.split("\\\\");
            String lastPath = dividedPath[dividedPath.length - 1].replaceAll(".java", "");
            String newLastPath = ChangeQuestion(lastPath);
            String newPathName = "";
            for (int j = 0; j < dividedPath.length - 1; j++) {
                newPathName += "\\\\";
                newPathName += dividedPath[j];
            }
            newPathName += "\\\\" + newLastPath;
            Scanner input = new Scanner(files.get(i));
            String line = "";
            String lines = "";

            while (input.hasNext()) {
                line = input.nextLine();
                if (line.contains("Question")) {
                    String maintainedLine = maintainedLine(line, newLastPath);
                    lines += maintainedLine + "\n";
                } else {
                    lines += line + "\n";
                }
            }
            input.close();
            File newFile = new File(newPathName + ".java");
            PrintWriter output = new PrintWriter(newFile);
            files.get(i).delete();
            newFile.createNewFile();

            output.println(lines);
            output.close();


        }


    }

    public static String maintainedLine(String line, String newLastPath) {
        String[] words = line.split("[\\n\\s]+");
        String result = "";
        for (int i = 0; i < words.length - 2; i++) {
            result += words[i] + " ";
        }
        result += newLastPath;
        result += " {";
        return result;
    }

    public static String ChangeQuestion(String s1) {

        int end = s1.indexOf("_") + 1;
        String subFirst = s1.substring(0, (end));
        String sublast = s1.substring(end);


        if (sublast.charAt(0) != 0 && sublast.length() == 1) {
            sublast = "0" + sublast;
        }


        return subFirst + sublast;
    }
}
