package week_14.assignments;

import java.util.*;

public class Question_14_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.print("Enter the first list(10 numbers):");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list1.add(number);
        }

        System.out.print("Enter the second list(10 numbers):");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list2.add(number);
        }
        String intersectionNumbers = findIntersections(list1, list2);
        System.out.println("Intersection numbers-->" + intersectionNumbers);
    }

    private static String findIntersections(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        Set<Integer> setList = new HashSet<>();
        setList.addAll(list1);
        setList.addAll(list2);

        for (Integer number : setList) {
            mergedList.remove(number);
        }
        return mergedList.toString();
    }
}
