package week_08.assignments;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {

        int[][] matrix1 = getArray(3, 3);
        int[][] matrix2 = getArray(3, 3);

        boolean equal = isEqual(matrix1, matrix2);
        System.out.println((equal) ? "The two arrays are strictly identical" : "The two arrays are not strictly identical");
    }

    public static int[][] getArray(int row, int column) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");

        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static boolean isEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;

        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
