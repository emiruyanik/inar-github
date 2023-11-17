package week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size:");

        int size = input.nextInt();
        int[][] array = new int[size][size];

        createRandomArray(array);

        ArrayList<Integer> arrayListRow = new ArrayList<>();
        ArrayList<Integer> arrayListColumn = new ArrayList<>();

        print(array);

        for (int i = 0; i < size; i++) {
            int total = 0;
            for (int j = 0; j < size; j++) {
                total += array[i][j];
            }
            arrayListRow.add(total);

        }
        for (int i = 0; i < size; i++) {
            int total = 0;
            for (int j = 0; j < size; j++) {
                total += array[j][i];
            }
            arrayListColumn.add(total);

        }
        ArrayList<Integer> maxRows = new ArrayList<>();
        for (int i = 0; i < arrayListRow.size(); i++) {
            int max = java.util.Collections.max(arrayListRow);
            if (arrayListRow.get(i) >= max) {
                maxRows.add(i);
            }
        }
        ArrayList<Integer> maxColumn = new ArrayList<>();
        for (int i = 0; i < arrayListColumn.size(); i++) {
            int max = java.util.Collections.max(arrayListColumn);
            if (arrayListColumn.get(i) >= max) {
                maxColumn.add(i);
            }
        }
        System.out.println("The largest row index:" + maxRows);
        System.out.println("The largest column index:" + maxColumn);

    }

    public static void print(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
    }

    public static void createRandomArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
    }
}
