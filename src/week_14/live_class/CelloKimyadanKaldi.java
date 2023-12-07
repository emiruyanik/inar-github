package week_14.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CelloKimyadanKaldi {
    public static void main(String[] args) throws FileNotFoundException {
        String a = "";
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java" +
                "\\src\\week_14\\live_class\\CelloKimyadanKaldi.java");
        Scanner input = new Scanner(file);
        Map<String, Integer> stringMap = new HashMap<>();
        while (input.hasNext()) {
            String word = input.next();
            String[] arrOfWord = word.split("[\\s._;}{/:)(=*+\\[\\]\\\\<>,\"\\-]+");
            for (int i = 0; i < arrOfWord.length; i++) {
                if (arrOfWord[i] == "") {
                    continue;
                }
                if (stringMap.containsKey(arrOfWord[i])) {
                    stringMap.replace(arrOfWord[i], stringMap.get(arrOfWord[i]) + 1);
                } else {
                    stringMap.put(arrOfWord[i], 1);
                }
            }
        }

        display(stringMap);
    }

    public static void display(Map<String, Integer> stringMap) {
        ArrayList<String> arrayList = new ArrayList<>(stringMap.keySet());
        Collections.sort(arrayList);

        for (String key : arrayList) {
            System.out.println(key + "-->" + stringMap.get(key));
        }
    }
}
