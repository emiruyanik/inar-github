package week_14.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_14_23 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_12\\assignments\\abc.txt");
        System.out.println(file.exists());
        Scanner input = new Scanner(file);
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();
            String[] words = word.split("[,.]");
            for (String s : words) {
                if (stringIntegerMap.containsKey(s)) {
                    stringIntegerMap.replace(s, stringIntegerMap.get(s) + 1);
                } else {
                    stringIntegerMap.put(s, 1);
                }

            }
        }
        List<String> keyWords = new ArrayList<>(stringIntegerMap.keySet());
        for (String keyWord : keyWords) {
            if (stringIntegerMap.get(keyWord) == 1) {
                System.out.println(keyWord);
            }
        }
    }
}
