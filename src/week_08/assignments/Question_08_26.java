package week_08.assignments;

import java.util.Scanner;

import static week_08.assignments.Question_08_25.getArray;

public class Question_08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = getArray(3, 3);
        double[][] rowSortedArray = rowSortedArray(array);
        printArray(rowSortedArray);
    }

    public static void printArray(double[][] rowSortedArray) {
        System.out.println("The sorted array is:");

        for (int i = 0; i < rowSortedArray.length; i++) {
            for (int j = 0; j < rowSortedArray[0].length; j++) {
                System.out.print(rowSortedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] rowSortedArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                double min = array[i][j];
                int indexOfMin = j;
                for (int k = j + 1; k < array[0].length; k++) {
                    if (min > array[i][k]) {
                        min = array[i][k];
                        indexOfMin = k;
                    }
                }
                if (indexOfMin != j) {
                    array[i][indexOfMin] = array[i][j];
                    array[i][j] = min;
                }
            }
        }
        return array;
    }
}
