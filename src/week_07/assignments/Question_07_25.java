package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c:");
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        if (delta(eqn) > 0) {
            double[] roots = calculationOfRoots(eqn);
            int numberOfRoots = solveQuadratic(roots);
            System.out.println("The number of real roots:" + numberOfRoots);
        } else if (delta(eqn) == 0) {
            double[] roots = calculationOfRoots(eqn);
            double[] root = new double[1];
            int numberOfRoots = solveQuadratic(root);
            System.out.println("The number of real roots:" + numberOfRoots);

        } else {

            System.out.println("It has no real roots");

        }


    }

    private static double[] calculationOfRoots(double[] eqn) {
        double[] result = new double[2];
        double delta = delta(eqn);
        if (delta > 0) {
            System.out.println(result[0] = ((-eqn[1] + Math.sqrt(delta)) / 2 * eqn[0]));
            System.out.println(result[1] = ((-eqn[1] - Math.sqrt(delta)) / 2 * eqn[0]));
        } else if (delta == 0) {
            System.out.println(result[0] = ((-eqn[1] - Math.sqrt(delta)) / 2 * eqn[0]));
        } else {
            System.out.println("It has no real roots");
        }


        return result;
    }

    public static double delta(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        return ((Math.pow(b, 2)) - (4 * a * c));
    }

    public static int solveQuadratic(double[] roots) {
        int count = 0;
        for (int i = 0; i < roots.length; i++) {
            count++;
        }
        return count;
    }
}
