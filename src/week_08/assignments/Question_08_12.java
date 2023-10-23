package week_08.assignments;

import java.util.Scanner;

public class Question_08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");
        int status = input.nextInt();

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}

        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        System.out.print("Enter the taxable income:");
        double taxableIncome = input.nextDouble();

        double tax = calculateTheTaxableIncome(brackets, rates, status, taxableIncome);
        System.out.println("Tax is :" + tax);
    }

    public static double calculateTheTaxableIncome(int[][] brackets, double[] rates, int status, double taxableIncome) {
        double result = 0;
        int returnNumber = getTheReturnNumber(taxableIncome, status, brackets);
        int counter = 0;

        for (int i = 0; i < 1; i++) {

            if (taxableIncome > brackets[status][0]) {
                result += brackets[status][0] * rates[0];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }

            } else {

                result += taxableIncome * rates[0];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }

            }
            if (taxableIncome > brackets[status][1]) {

                result += (brackets[status][1] - brackets[status][0]) * rates[1];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }
            } else {
                result += (taxableIncome - brackets[status][0]) * rates[1];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }
            }
            if (taxableIncome > brackets[status][2]) {
                result += (brackets[status][2] - brackets[status][1]) * rates[2];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }

            } else {
                result += (taxableIncome - brackets[status][1]) * rates[2];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }
            }
            if (taxableIncome > brackets[status][3]) {
                result += (brackets[status][3] - brackets[status][2]) * rates[3];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }


            } else {
                result += (taxableIncome - brackets[status][2]) * rates[3];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }
            }
            if (taxableIncome > brackets[status][4]) {

                result += (taxableIncome - brackets[status][4]) * rates[5];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }


            } else {
                result += (taxableIncome - brackets[status][3]) * rates[4];
                if (counter == returnNumber) {
                    break;
                } else {
                    counter++;
                }
            }

        }

        return result;
    }

    public static int getTheReturnNumber(double taxableIncome, int status, int[][] brackets) {
        int returnNumber = 0;
        for (int i = 0; i < 5; i++) {
            if (taxableIncome > brackets[status][i]) {
                returnNumber++;
            }
        }
        return returnNumber;
    }
}
