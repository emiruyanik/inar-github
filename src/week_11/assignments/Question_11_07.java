package week_11.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0:");

        int x = input.nextInt();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        while (x != 0) {
            integerArrayList.add(x);
            x = input.nextInt();
        }
        shuffle(integerArrayList);
        for (Integer integer : integerArrayList) {
            System.out.print(integer + " ");
        }

    }

    public static void shuffle(ArrayList<Integer> arrayList) {
        Integer[] array = new Integer[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * (array.length + 1));
            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        arrayList.clear();
        arrayList.addAll(Arrays.asList(array));
    }
}
