package week_12.live_class;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Crawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an URL:");
        String URL = input.nextLine();
        crawler(URL);
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLS = new ArrayList<>();
        ArrayList<String> listOfTraversedURLS = new ArrayList<>();

        listOfPendingURLS.add(startingURL);
        while (!listOfPendingURLS.isEmpty() && listOfTraversedURLS.size() <= 100) {
            String URLString = listOfPendingURLS.remove(0);
            if (!listOfTraversedURLS.contains(URLString)) {
                listOfTraversedURLS.add(URLString);
                System.out.println("crawl" + URLString);

                for (String s : getSubURLs(URLString)) {
                    if (!listOfTraversedURLS.contains(s)) {
                        listOfPendingURLS.add(s);
                    }
                }
            }


        }
    }
    public static ArrayList<String> getSubURLs(String urlString){
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url=new URL(urlString);
            Scanner input=new Scanner(url.openStream());
            int current=0;
            while (input.hasNext()){
                String line=input.nextLine();
                current=line.indexOf("http:",current);
                while (current>0){
                    int endIndex=line.indexOf("\"",current);
                    if (endIndex>0){
                        list.add(line.substring(current,endIndex));
                        current=line.indexOf("http:",endIndex);
                    }else {
                        current=-1;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
}