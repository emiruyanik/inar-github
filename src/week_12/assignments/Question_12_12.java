package week_12.assignments;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_12\\assignments\\spaceCorreecting.java");


        Scanner input = new Scanner(file);

        String line = "";

        while (input.hasNext()) {
            line += input.nextLine() + "\n";

        }
        line = line.replaceAll("\\s*\\{", " {");
        PrintWriter output = new PrintWriter(file);

        output.println(line);

        input.close();
        output.close();


    }
}
