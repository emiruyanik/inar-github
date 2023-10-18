package week_08.assignments;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {


        double[][] matrix = getMatrix();
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements in column " + i + " " + sumColumn(matrix, i));
        }
    }

    public static double sumColumn(double[][] matrix, int i) {
        double total = 0;
        for (int j = 0; j < matrix.length; j++) {
            total += matrix[j][i];
        }
        return total;
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[3][4];
        System.out.println("Enter a 3 by 4 matrix row by row");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextDouble();

            }

        }
        return result;
    }
}
