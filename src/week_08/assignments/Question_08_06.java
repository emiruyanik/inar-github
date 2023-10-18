package week_08.assignments;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {


        System.out.println("Enter matrix1:");
        int[][] matrix1 = getMatrix(3, 3);

        System.out.println("Enter matrix2:");
        int[][] matrix2 = getMatrix(3, 3);

        int[][] matrix3 = multiplicationOfTwoMatrices(matrix1, matrix2);

        printMatrices(matrix1, matrix2, matrix3);


    }

    public static void printMatrices(int[][] matrix1, int[][] matrix2, int[][] matrix3) {
        int numberOfRows = Math.max(matrix1.length, matrix2.length);

        for (int i = 0; i < numberOfRows; i++) {
            getRowOfMatrix(matrix1, i);

            if (i == numberOfRows / 2) {
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }

            getRowOfMatrix(matrix2, i);

            if (i == numberOfRows / 2) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            getRowOfMatrix(matrix3, i);
            System.out.println();
        }
    }

    public static void getRowOfMatrix(int[][] matrix1, int i) {
        if (matrix1.length >= i) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
        } else {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("  ");
            }
        }
    }

    public static int[][] multiplicationOfTwoMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("You have entered invalid input");
            System.exit(1);
        }
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

    public static int[][] getMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[row][column];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }
}