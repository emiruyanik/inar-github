package week_11.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter a list of integers ending with 0:");

        int x = input.nextInt();
        while (x != 0) {
            list.add(x);
            x = input.nextInt();
        }
        System.out.println("Before sorting:");
        System.out.println(list);

        automaticSort(list);


        System.out.println("After sorting");
        System.out.println(list);
    }

    public static void automaticSort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Integer[] array = new Integer[list.size()];
        list.toArray(array);

        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int currentIndexOfMin = i;
            for (int j = i; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentIndexOfMin = j;
                }
            }
            if (currentIndexOfMin != i) {
                array[currentIndexOfMin] = array[i];
                array[i] = currentMin;
            }

        }
        list.clear();
        list.addAll(Arrays.asList(array));
    }
}
