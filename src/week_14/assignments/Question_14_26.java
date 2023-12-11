package week_14.assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Question_14_26 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(74);
        list.add(70);
        list.add(58);
        list.add(35);
        String originalLinkedList = list.toString();

        System.out.println("Original linked list-->" + originalLinkedList);
        List<Integer> updatedLinkedList = updatedLinkedList(list);

        String upDatedList = list.toString();
        System.out.println("Updated linked list-->" + updatedLinkedList);
    }

    private static List<Integer> updatedLinkedList(List<Integer> list) {
        List<Integer> result = new LinkedList<>(list);
        for (int i = 0; i < list.size() - 1; i++) {
            int gcd = findGcd(list.get(i), list.get(i + 1));
            result.add(2 * i + 1, gcd);
        }
        return result;
    }

    private static int findGcd(Integer integer, Integer integer1) {
        int min = Math.min(integer, integer1);
        int possibleGcd = 1;
        for (int i = 2; i <= min; i++) {
            if (integer % i == 0 && integer1 % i == 0) {
                possibleGcd = i;
            }
        }
        return possibleGcd;
    }


}
