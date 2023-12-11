package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_14_25 {
    public static void main(String[] args) {
        List<Integer> randomIntegerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 100);
            randomIntegerList.add(randomNumber);
        }
        String generatedNumbers = randomIntegerList.toString();
        System.out.println("Generated arrayList-->" + generatedNumbers);

        Set<Integer> unrepeatedNumbers = new HashSet<>();

        int generatedTargetSum = (int) (Math.random() * 100);
        System.out.println("GeneratedTargetSum-->" + generatedTargetSum);

        for (Integer integer : randomIntegerList) {
            if (integer <= generatedTargetSum) {
                unrepeatedNumbers.add(integer);
            }
        }
        boolean isEqual = false;
        List<Integer> unrepeatedNumbersList = new ArrayList<>(unrepeatedNumbers);
        for (int i = 0; i < unrepeatedNumbersList.size(); i++) {
            int number1 = unrepeatedNumbersList.get(i);
            for (int j = i + 1; j < unrepeatedNumbersList.size(); j++) {
                int number2 = unrepeatedNumbersList.get(j);
                if (number1 + number2 == generatedTargetSum) {
                    System.out.println("Numbers are-->" + number1 + "," + number2);
                    isEqual = true;
                    break;
                }
            }
        }
        if (!isEqual) {
            System.out.println("There are no two numbers like that!");
        }
    }
}
