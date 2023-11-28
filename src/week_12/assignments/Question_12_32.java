package week_12.assignments;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_32 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the URL:");

        String receivedURL = input.nextLine();

        ArrayList<String> listOfPendingURLS = new ArrayList<>();
        ArrayList<String> listOfTraversedURLS = new ArrayList<>();

        listOfPendingURLS.add(receivedURL);
        boolean check = true;
        while (check) {
            try {
                String firstURL = listOfPendingURLS.remove(0);
                if (!listOfTraversedURLS.contains(firstURL)) {
                    listOfTraversedURLS.add(firstURL);
                }
                URL URL = new URL(firstURL);
                Scanner inputCrawler = new Scanner(URL.openStream());

                int begin = 0;
                while (inputCrawler.hasNext()) {
                    String line = inputCrawler.nextLine();
                    if (line.contains("Tamagotchi")) {
                        System.out.println("The word has been found!");
                        System.out.println("It is-->" + firstURL);
                        check = false;
                    } else {
                        begin = line.indexOf("https:", begin);
                        while (begin > 0) {
                            int end = line.indexOf("\"", begin);
                            if (end > 0) {
                                String findedURL = line.substring(begin, end);
                                System.out.println(findedURL);

                                if (!listOfTraversedURLS.contains(findedURL)) {
                                    listOfPendingURLS.add(findedURL);
                                }
                                begin = line.indexOf("https:", end);
                            } else {
                                begin = -1;
                            }
                        }
                    }

                }


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
}
