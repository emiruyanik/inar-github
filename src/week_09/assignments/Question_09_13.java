package week_09.assignments;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargest(matrix);
        System.out.println("The location of the largest element is " + location.maxValue + " at(" + location.row + "," + location.column + ")");
    }
}
