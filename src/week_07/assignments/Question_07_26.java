package week_07.assignments;

import java.util.Scanner;

public class Question_07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of list1:");
        int sizeOfList1 = input.nextInt();
        System.out.print("Enter the list1:");
        int[] list1 = new int[sizeOfList1];
        for (int i = 0; i < sizeOfList1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the size of list2:");
        int sizeOfList2 = input.nextInt();
        System.out.print("Enter the list2:");
        int[] list2 = new int[sizeOfList2];
        for (int i = 0; i < sizeOfList2; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println((equals(list1, list2)) ? "Two lists are strictly identical" : "Two lists are not strictly identical");

    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;

        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
