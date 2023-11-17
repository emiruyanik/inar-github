package week_11.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers for list1:");

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int numb = input.nextInt();
            list1.add(numb);
        }
        System.out.print("Enter five integers for list2:");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int numb = input.nextInt();
            list2.add(numb);
        }
        ArrayList<Integer> unionList = union(list1, list2);
        System.out.println(unionList);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);

        return union;
    }
}
