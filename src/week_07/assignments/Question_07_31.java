package week_07.assignments;


import java.util.Arrays;
import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of list1:");
        int sizeOfList1 = input.nextInt();
        System.out.print("Enter the list1:");
        int[] list1 = new int[sizeOfList1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the size of list2:");
        int sizeOfList2 = input.nextInt();
        System.out.print("Enter the list2:");
        int[] list2 = new int[sizeOfList2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedLists = merge(list1, list2);
        Arrays.sort(mergedLists);
        for (int numb : mergedLists) {
            System.out.print(numb + " ");

        }

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        int count = 0;
        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i];
            count++;
        }
        for (int i = 0; i < list2.length; i++) {
            result[count] = list2[i];
            count++;
        }
        return result;
    }
}
