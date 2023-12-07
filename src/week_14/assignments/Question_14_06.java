package week_14.assignments;

import java.util.ArrayList;
import java.util.List;

public class Question_14_06 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100);
            integerList.add(number);
        }
        oddEvenOrder(integerList);
        String numbers = integerList.toString();
        System.out.println("Numbers-->" + numbers);
    }

    public static void oddEvenOrder(List<Integer> integerList) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            } else {
                oddNumbers.add(integer);
            }
        }
        integerList.clear();
        integerList.addAll(oddNumbers);
        integerList.addAll(evenNumbers);
    }
}
