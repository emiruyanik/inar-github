package week_08.assignments;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {

        int[][] matrix = getMatrix();
        int flippedRow = flippedRow(matrix);
        int flippedColumn = flippedColumn(matrix);

        System.out.println("The flipped cell is at(" + flippedRow + "," + flippedColumn + ")");


    }

    public static int flippedColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean check = true;
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                check = false;
            }
            if (!check) {
                return i;
            }
        }
        return -1;
    }

    public static int flippedRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean check = true;
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                check = false;
            }
            if (!check) {
                return i;
            }
        }
        return -1;
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}


