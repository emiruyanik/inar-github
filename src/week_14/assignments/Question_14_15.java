package week_14.assignments;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int numberOfElements = input.nextInt();

        System.out.println("Enter the elements of the arraylist(each in the range[1," + numberOfElements + "]");
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < numberOfElements; i++) {
            int numb = input.nextInt();
            if (integerMap.containsKey(numb)) {
                integerMap.replace(numb, integerMap.get(numb) + 1);
            } else {
                integerMap.put(numb, 1);
            }
        }
        List<Integer> keyNumbers = new ArrayList<>(integerMap.keySet());


        List<Integer> fromOneToN = addNumbers(numberOfElements);
        for (Integer keyNumber : keyNumbers) {
            fromOneToN.remove(keyNumber);
        }


        String arr = fromOneToN.toString();
        System.out.println("The numbers missing from list-->" + arr);
    }

    public static List<Integer> addNumbers(int numberOfElements) {
        List<Integer> fromOneToN = new ArrayList<>();
        for (int i = 1; i <= numberOfElements; i++) {
            fromOneToN.add(i);
        }
        return fromOneToN;
    }
}
