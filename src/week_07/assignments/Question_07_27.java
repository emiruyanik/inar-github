package week_07.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_27 {
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


        boolean equals = equals(list1, list2);
        System.out.println((equals) ? "Two lists are identical" : "Two lists are not identical");


    }

    public static boolean equals(int[] list1, int[] list2) {
        String str1 = Arrays.toString(list1);
        String str2 = Arrays.toString(list2);

        if (str1.length() != str2.length()) {
            return false;
        }
        boolean check1 = strControl(str1, str2);
        boolean check2 = strControl(str2, str1);

        if (!(check1 && check2)) {
            return false;
        }


        return true;
    }

    public static boolean strControl(String str2, String str1) {
        for (int i = 0; i < str1.length(); i++) {
            String ch1 = "";
            ch1 = str1.charAt(i) + "";
            if (!str2.contains(ch1)) {
                return false;
            }

        }
        return true;
    }

}
