package week_08.assignments;

import java.util.Arrays;

public class Question_08_29 {
    public static void main(String[] args) {
        int[][] matrix1 = Question_08_28.getArray(3, 3);
        int[][] matrix2 = Question_08_28.getArray(3, 3);

        System.out.println((isSameContent(matrix1, matrix2)) ? "The two arrays are identical" : "The two arrays are not identical");

    }

    public static boolean isSameContent(int[][] matrix1, int[][] matrix2) {
        int[] contentsOfMatrix1 = new int[matrix1.length * matrix1[0].length];
        int[] contentsOfMatrix2 = new int[matrix2.length * matrix2[0].length];

        carryDoubleArrayToSingleArray(matrix1, contentsOfMatrix1);
        carryDoubleArrayToSingleArray(matrix2, contentsOfMatrix2);

        return equals(contentsOfMatrix1, contentsOfMatrix2);

    }

    public static void carryDoubleArrayToSingleArray(int[][] matrix1, int[] contentsOfMatrix1) {
        int counter = (matrix1.length * matrix1[0].length) - 1;
        for (int[] ints : matrix1) {
            for (int j = 0; j < matrix1[0].length; j++) {
                contentsOfMatrix1[counter] = ints[j];
                counter--;
            }
        }
    }

    public static boolean checkFromList1ToList2(int[] list1, int[] list2) {
        for (int number : list1) {
            boolean check = false;
            for (int i : list2) {
                if (number == i) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }
        return true;

    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean checkFromList1ToList2 = checkFromList1ToList2(list1, list2);
        boolean checkFromList2ToList1 = checkFromList2ToList1(list2, list1);

        return checkFromList1ToList2 && checkFromList2ToList1;
    }

    public static boolean checkFromList2ToList1(int[] list2, int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            int number = list2[i];
            boolean check = false;
            for (int j = 0; j < list2.length; j++) {
                if (number == list1[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }
        return true;
    }
}
