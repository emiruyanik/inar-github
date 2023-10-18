package week_08.assignments;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        double[][] matrix = getArray();
        int[] largestElement = findTheLargestIndex(matrix);
        System.out.println("The location of the largest element is (" + largestElement[0] + "," + largestElement[1] + ")");
    }

    public static int[] findTheLargestIndex(double[][] matrix) {
        int[] result = new int[2];
        double currentLargestElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                double largestElement = matrix[i][j];
                if (largestElement > currentLargestElement) {
                    currentLargestElement = largestElement;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static double[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");

        int rowNumber = input.nextInt();
        int columnNumber = input.nextInt();
        double[][] result = new double[rowNumber][columnNumber];

        System.out.println("Enter the array:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }
}
