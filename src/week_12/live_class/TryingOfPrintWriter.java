package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryingOfPrintWriter {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") +
                "/inar-java/src/week_12/live_class/A Tale of Two cities.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        File file1 = new File(file.getParent() + "/emir.txt");

        try {
            PrintWriter output = new PrintWriter(file1);
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String str = input.nextLine();
                output.println(str);

            }
            input.close();
            output.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
