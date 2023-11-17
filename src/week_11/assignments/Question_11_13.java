package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers:");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = input.nextInt();
            list.add(x);
        }

        System.out.println("The distinct integers are:");

        distinctNumbers(list);
        System.out.println(list);
    }

    public static void distinctNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : list) {
            if (arrayList.contains(integer)) {
                continue;
            } else {
                arrayList.add(integer);
            }
        }
        list.clear();
        list.addAll(arrayList);
    }
}
