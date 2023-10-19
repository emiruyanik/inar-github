package week_08.assignments;

import java.util.Scanner;

public class Question_08_34 {
    public static void main(String[] args) {

        double[][] array = getArray(6);
        double[] rightMostLowestPoint = getRightMostLowestPoint(array);
        System.out.println("The rightmost lowest point is (" + rightMostLowestPoint[0] + "," + rightMostLowestPoint[1] + ")");
    }

    private static double[] getRightMostLowestPoint(double[][] array) {
        double[] result = new double[2];

        result[1] = getLowestPoint(array);
        result[0] = getRightMostPoint(array);

        return result;
    }

    public static double getLowestPoint(double[][] array) {
        double lowestPoint = array[0][1];
        for (int i = 1; i < array.length; i++) {
            if (array[i][1] < lowestPoint) {
                lowestPoint = array[i][1];
            }
        }
        return lowestPoint;
    }


    public static double getRightMostPoint(double[][] array) {
        int indexOfLowestPoint = findTheIndexOfLowestPoint(array);
        double lowestPoint = getLowestPoint(array);
        double currentRightMostPoint = array[indexOfLowestPoint][0];
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] <= lowestPoint) {
                if (currentRightMostPoint < array[i][0]) {
                    currentRightMostPoint = array[i][0];
                }
            }
        }
        return currentRightMostPoint;
    }

    public static double[][] getArray(int numb) {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[numb][2];
        System.out.println("Enter " + numb + " points:");
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

    public static int findTheIndexOfLowestPoint(double[][] array) {
        double lowestPoint = array[0][1];
        int currentIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i][1] < lowestPoint) {
                lowestPoint = array[i][1];
                currentIndex = i;
            }
        }
        return currentIndex;
    }
}

