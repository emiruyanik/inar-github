package week_14.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_14_13 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 3);
            integerList.add(randomNumber);
        }
        Map<Integer, Integer> integerMap = new HashMap<>();
        String generatedNumbers = integerList.toString();

        System.out.println(generatedNumbers);

        for (int i = 0; i < integerList.size(); i++) {
            if (integerMap.containsKey(integerList.get(i))) {
                integerMap.replace(integerList.get(i), integerMap.get(integerList.get(i)) + 1);
            } else {
                integerMap.put(integerList.get(i), 1);
            }
        }
        List<Integer> keyNumbers = new ArrayList<>(integerMap.keySet());
        System.out.print("Elements appearing more than n/3-->");
        for (int i = 0; i < keyNumbers.size(); i++) {
            if (integerMap.get(keyNumbers.get(i)) > integerList.size() / 3) {
                System.out.print(keyNumbers.get(i) + " ");
            }
        }
    }
}
