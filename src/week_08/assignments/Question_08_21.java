package week_08.assignments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities:");
        int numberOfCities = input.nextInt();

        double[][] coordinates = getCoordinates(numberOfCities);
        double[] centralCity = getTheCentralCity(coordinates);
        System.out.println("The central city is at (" + centralCity[0] + "," + centralCity[1] + ")");
        System.out.println("The total distance to all other cities is " + totalDistance(coordinates));
    }

    public static double totalDistance(double[][] coordinates) {
        double currentMiniTotal = 0;
        double x = coordinates[0][0];
        double y = coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            currentMiniTotal += findTheDistanceBetweenTwoCities(x, y, coordinates[i][0], coordinates[i][1]);
        }

        for (int i = 1; i < coordinates.length; i++) {
            double distance1 = coordinates[i][0];
            double distance2 = coordinates[i][1];
            double total = 0;
            for (int j = 0; j < coordinates.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    total += findTheDistanceBetweenTwoCities(distance1, distance2, coordinates[j][0], coordinates[j][1]);
                }
            }
            if (total < currentMiniTotal) {
                currentMiniTotal = total;

            }
        }
        return currentMiniTotal;

    }

    public static double[] getTheCentralCity(double[][] coordinates) {
        double[] result = new double[2];
        result[0] = coordinates[0][0];
        result[1] = coordinates[0][1];

        double currentMiniTotal = 0;
        double x = coordinates[0][0];
        double y = coordinates[0][1];
        for (int i = 1; i < coordinates.length; i++) {
            currentMiniTotal += findTheDistanceBetweenTwoCities(x, y, coordinates[i][0], coordinates[i][1]);
        }

        for (int i = 1; i < coordinates.length; i++) {
            double distance1 = coordinates[i][0];
            double distance2 = coordinates[i][1];
            double total = 0;
            for (int j = 0; j < coordinates.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    total += findTheDistanceBetweenTwoCities(distance1, distance2, coordinates[j][0], coordinates[j][1]);
                }
            }
            if (total < currentMiniTotal) {
                currentMiniTotal = total;
                result[0] = distance1;
                result[1] = distance2;
            }
        }
        return result;
    }

    public static double findTheDistanceBetweenTwoCities(double distance1, double distance2, double v, double v1) {
        return Math.sqrt(Math.pow(v - distance1, 2) + Math.pow(v1 - distance2, 2));
    }


    public static double[][] getCoordinates(int numberOfCities) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the cities:");

        double[][] result = new double[numberOfCities][2];

        for (int i = 0; i < numberOfCities; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();

        }
        return result;
    }
}
