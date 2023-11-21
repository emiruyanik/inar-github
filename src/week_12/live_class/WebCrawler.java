package week_12.live_class;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Url:");
        String url = input.nextLine();
        crawler(url);
    }

    public static void crawler(String urlAddress) {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();

        pendingURLs.add(urlAddress);
        while (!pendingURLs.isEmpty() && traversedURLs.size() <= 100) {
            String startUrl = pendingURLs.remove(0);

            if (!traversedURLs.contains(startUrl)) {
                traversedURLs.add(startUrl);
                System.out.println("craw:" + startUrl);

                for (String s : getSubURLs(startUrl)) {
                    if (!traversedURLs.contains(s)) {
                        pendingURLs.add(s);
                    }

                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String startURL) {
        ArrayList<String> result = new ArrayList<>();
        try {
            URL url = new URL(startURL);
            Scanner input = new Scanner(url.openStream());
            int currentIndex = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                currentIndex = line.indexOf("http:", currentIndex);

                while (currentIndex > 0) {
                    int endIndex = line.indexOf("\"", currentIndex);
                    if (endIndex > 0) {
                        result.add(line.substring(currentIndex, endIndex));
                        currentIndex = line.indexOf("http:", endIndex);
                    } else {
                        currentIndex = -1;
                    }
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid url");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        return result;
    }
}
