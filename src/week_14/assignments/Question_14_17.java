package week_14.assignments;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers(Enter 0 to stop):");

        List<Integer> integerList = new ArrayList<>();
        int number = input.nextInt();

        while (number != 0) {
            integerList.add(number);
            number = input.nextInt();
        }
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (Integer integer : integerList) {
            if (integerIntegerMap.containsKey(integer)) {
                integerIntegerMap.replace(integer, integerIntegerMap.get(integer) + 1);
            } else {
                integerIntegerMap.put(integer, 1);
            }
        }
        List<Integer> keyNumbers = new ArrayList<>(integerIntegerMap.keySet());
        Set<Integer> repeatedKeyNumbers = new HashSet<>(integerIntegerMap.values());

//        for (Integer integer : keyNumbers) {
//            repeatedKeyNumbers.add(integerIntegerMap.get(integer));
//        }
        int totalOfMostRepeatedNumber = findTotalOfMostRepeatedNumber(repeatedKeyNumbers);
        List<Integer> result = new ArrayList<>();

        for (Integer keyNumber : keyNumbers) {
            if (totalOfMostRepeatedNumber == integerIntegerMap.get(keyNumber)) {
                result.add(keyNumber);
            }
        }
        String output = result.toString();
        System.out.println("The numbers mos repeated are-->" + output);

    }

    private static int findTotalOfMostRepeatedNumber(Set<Integer> repeatedKeyNumbers) {
        return Collections.max(repeatedKeyNumbers);
    }
}
