package week_12.assignments;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an URL:");
        String URLName = input.nextLine();
        try {
            int count = 0;

            URL url = new URL(URLName);
            Scanner inputURL = new Scanner(url.openStream());

            while (inputURL.hasNext()) {
                String line = inputURL.nextLine();
                count += line.length();
            }
            System.out.println("The file size is-->" + count);
        } catch (MalformedURLException ex) {
            System.out.println("Wrong URL!");
        }
    }
}
