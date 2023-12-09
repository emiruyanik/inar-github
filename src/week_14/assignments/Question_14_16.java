package week_14.assignments;

import java.io.File;
import java.util.*;

public class Question_14_16 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\week_14\\assignments\\Question_14_16.java");
        Scanner input = new Scanner(file);
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();
            String[] arrOfWord = word.split("[\\s._;}{/:)(=*+\\[\\]\\\\<>,\"\\-]+");
            for (int i = 0; i < arrOfWord.length; i++) {
                if (stringIntegerMap.containsKey(arrOfWord[i])) {
                    stringIntegerMap.replace(arrOfWord[i], stringIntegerMap.get(arrOfWord[i]));
                } else {
                    stringIntegerMap.put(arrOfWord[i], 1);
                }
            }
            List<String> keyWords = new ArrayList<>(stringIntegerMap.keySet());
            for (int i = 0; i < keyWords.size(); i++) {
                System.out.println(keyWords.get(i) + "-->" + stringIntegerMap.get(keyWords.get(i)));
            }
        }
    }
}
