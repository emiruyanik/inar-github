package week_08.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {

        System.out.println("Enter a00,a01,b0");
        double[][] linearEquation1 = getLinearEquation();
        System.out.println("Enter a10,a11,b1");
        double[][] linearEquation2 = getLinearEquation();
        boolean isEquationOrNot = isEquationOrNot(linearEquation1, linearEquation2);
        if (isEquationOrNot) {
            double[] result = calculateTheLinearEquation(linearEquation1, linearEquation2);
            System.out.println("x is " + result[0] + " y is " + result[1]);
        }

    }

    public static boolean isEquationOrNot(double[][] linearEquation1, double[][] linearEquation2) {
        if (((linearEquation1[0][0] * linearEquation1[0][1]) - (linearEquation2[0][0] * linearEquation2[0][1])) == 0) {
            System.out.println("The equation has no solution");
            return false;
        }
        return true;
    }

    public static double[] calculateTheLinearEquation(double[][] linearEquation1, double[][] linearEquation2) {
        double[] result = new double[2];

        result[0] = (linearEquation1[1][0] * linearEquation2[0][1] - linearEquation2[1][0] * linearEquation1[0][1]) /
                (linearEquation1[0][0] * linearEquation2[0][1] - linearEquation1[0][1] * linearEquation2[0][0]);
        result[1] = (linearEquation2[1][0] * linearEquation1[0][0] - linearEquation1[1][0] * linearEquation2[0][0]) /
                (linearEquation1[0][0] * linearEquation2[0][1] - linearEquation1[0][1] * linearEquation2[0][0]);

        return result;

    }

    public static double[][] getLinearEquation() {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[2][2];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = input.nextDouble();
                count++;
                if (count == 3) {
                    break;
                }
            }

        }
        return result;
    }
}
