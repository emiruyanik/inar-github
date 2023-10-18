package week_08.assignments;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {


        System.out.println("Enter 3 by 3 matrix1:");
        double[][] matrix1 = getMatrix();
        System.out.println("Enter 3 by 3 matrix2:");
        double[][] matrix2 = getMatrix();
        System.out.println("The matrices are added as follows:");
        double[][] addedMatrix1AndMatrix2 = addMatrixes(matrix1, matrix2);
        printAddedMatrixes(addedMatrix1AndMatrix2);

    }

    public static void printAddedMatrixes(double[][] addedMatrix1AndMatrix2) {
        for (int i = 0; i < addedMatrix1AndMatrix2.length; i++) {
            for (int j = 0; j < addedMatrix1AndMatrix2.length; j++) {
                System.out.print(addedMatrix1AndMatrix2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrixes(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] getMatrix() {
        double[][] result = new double[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }
}
