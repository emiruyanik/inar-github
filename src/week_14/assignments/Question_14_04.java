package week_14.assignments;

import java.util.*;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size 'n 'for arrayList1:");
        int index1 = input.nextInt();

        List<Integer> list1 = new ArrayList<>(index1);
        System.out.print("Enter " + index1 + " Integers for arrayList1:");
        for (int i = 0; i < index1; i++) {
            int number = input.nextInt();
            list1.add(number);
        }
        Collections.sort(list1);

        System.out.print("Enter the size 'n 'for arrayList2:");
        int index2 = input.nextInt();

        List<Integer> list2 = new ArrayList<>(index1);
        System.out.print("Enter " + index2 + " Integers for arrayList1:");
        for (int i = 0; i < index2; i++) {
            int number = input.nextInt();
            list2.add(number);
        }
        Collections.sort(list2);
        Collections.reverse(list2);

        List<Integer> mergedList = new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        String mergedNumbers = mergedList.toString();
        System.out.println("Merged and sorted array:" + mergedNumbers);
    }
}
