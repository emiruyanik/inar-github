package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_07 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100);
            integerList.add(number);
        }

        String numbers = integerList.toString();
        System.out.println("Numbers-->" + numbers);

        Collections.sort(integerList);

        int randomIndex = (int) (Math.random() * 10);
        System.out.println("The " + randomIndex + "th " + "largest element is-->" + integerList.get(integerList.size() - randomIndex));
    }
}
