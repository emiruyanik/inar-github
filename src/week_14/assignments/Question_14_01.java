package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_01 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100);
            integerList.add(number);
        }
        String numbers = integerList.toString();
        System.out.println("Generated integers:" + numbers);

        Collections.reverse(integerList);
        String reversedNumbers=integerList.toString();
        System.out.println("Reversed list:"+reversedNumbers);



    }
}
