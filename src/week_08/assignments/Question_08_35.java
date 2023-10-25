package week_08.assignments;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix:");

        int numberOfRows = input.nextInt();

        int[][] matrix = getMatrix(numberOfRows);
        int size = getTheSize(matrix);

        int[] coordinates = getTheCoordinate(matrix);

        System.out.println("The maximum square submatrix is at (" + coordinates[0] + "," + coordinates[1] + ") with size " + size);


    }

    public static int[] getTheCoordinate(int[][] matrix) {
        int[] result = new int[2];

        boolean check = false;
        for (int i = matrix.length; i > 1; i--) {
            for (int j = 0; j <= matrix.length - i; j++) {
                for (int k = 0; k <= matrix.length - i; k++) {
                    check = isSquareSubMatrix(i, j, k, matrix);
                    if (check) {
                        result[0] = j;
                        result[1] = k;
                        return result;
                    }
                }
            }


        }
        return result;
    }

    public static int getTheSize(int[][] matrix) {
        boolean check = false;
        for (int i = matrix.length; i > 1; i--) {
            for (int j = 0; j <= matrix.length - i; j++) {
                for (int k = 0; k <= matrix.length - i; k++) {
                    check = isSquareSubMatrix(i, j, k, matrix);
                    if (check) {
                        return i;
                    }
                }
            }


        }
        return 0;
    }

    public static boolean isSquareSubMatrix(int i, int j, int k, int[][] matrix) {
        for (int l = j; l < i + j; l++) {
            for (int m = k; m < i + k; m++) {
                if (matrix[l][m] != 1) {
                    return false;
                }

            }
        }
        return true;
    }


    public static int[][] getMatrix(int numberOfRows) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix row by row:");

        int[][] matrix = new int[numberOfRows][numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                matrix[i][j] = input.nextInt();
            }

        }
        return matrix;
    }
}
