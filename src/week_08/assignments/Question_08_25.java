package week_08.assignments;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        double[][] matrix = getArray(3, 3);
        boolean markovMatrix = markovMatrix(matrix);
        System.out.println((markovMatrix) ? "It is a markov matrix" : "It is not markov matrix");
    }

    public static boolean markovMatrix(double[][] matrix) {
        boolean isPositiveAllOfThem = isPositiveAllOfThem(matrix);
        boolean isTotalColumnOne = isTotalColumnOne(matrix);


        return isTotalColumnOne && isPositiveAllOfThem;
    }


    public static boolean isTotalColumnOne(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            double total = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                total += matrix[j][i];
            }
            if (total != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPositiveAllOfThem(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double[][] getArray(int row, int column) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");

        double[][] matrix = new double[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }
}
