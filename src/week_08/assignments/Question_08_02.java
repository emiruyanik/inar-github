package week_08.assignments;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {


        double[][] matrix = getArray();

        double maxDiagonal = maxDiagonal(matrix);
        System.out.println(maxDiagonal);
    }

    public static double maxDiagonal(double[][] matrix) {
        double max1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    max1 += matrix[i][j];
                }
            }
        }
        double max2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == 3) {
                    max2 += matrix[i][j];
                }
            }
        }
        return Math.max(max1, max2);
    }

    public static double[][] getArray() {
        double[][] result = new double[4][4];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4 by 4 matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }

        }
        return result;
    }
}
