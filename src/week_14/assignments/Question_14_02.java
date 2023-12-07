package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_14_02 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = (int) (Math.random() * 100);
            integerList.add(number);
        }
        String numbers = integerList.toString();
        System.out.println("Generated arraylist:" + numbers);

        Set<Integer> unduplicatedNumbers = new HashSet<>(integerList);
        String printUnduplicatedNumbers = unduplicatedNumbers.toString();
        System.out.println("Arraylist after removing duplicates:" + printUnduplicatedNumbers);
    }
}
