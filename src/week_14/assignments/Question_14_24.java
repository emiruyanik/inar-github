package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_14_24 {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        int k = (int) (Math.random() * 10);
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 9 + 1);
            randomNumbers.add(randomNumber);
        }
        String list = randomNumbers.toString();
        System.out.println("numbers-->" + list);
        int indexOfFirstRepeated = -1;
        int indexOfSecondRepeated = -1;
        int repeatedNumber = -1;
        boolean isRepeated = false;
        Set<Integer> unrepeatedNumbers = new HashSet<>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            if (unrepeatedNumbers.contains(randomNumbers.get(i))) {
                indexOfSecondRepeated = i;
                repeatedNumber = randomNumbers.get(i);
                indexOfFirstRepeated = randomNumbers.indexOf(repeatedNumber);
                isRepeated = true;
                if (indexOfSecondRepeated - indexOfFirstRepeated <= k) {
                    break;
                }

            } else {
                unrepeatedNumbers.add(randomNumbers.get(i));
            }
        }
        if (isRepeated) {

            if (indexOfSecondRepeated - indexOfFirstRepeated <= k) {
                System.out.println("Is there a nearby duplicate with absolute difference at most " + k + "?" + true);
            } else {
                System.out.println("Is there a nearby duplicate with absolute difference at most " + k + "?" + false);
            }
        } else {
            System.out.println("There is no duplicate numbers");
        }

    }
}
