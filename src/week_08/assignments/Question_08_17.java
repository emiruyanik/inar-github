package week_08.assignments;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of banks:");
        int numberOFBanks = input.nextInt();

        System.out.print("Enter minimum total assets for keeping a bank safe:");
        double minimumTotalAsset = input.nextDouble();

        double[] totalAssets = new double[numberOFBanks];
        double[][] borrowers = new double[numberOFBanks][numberOFBanks];


        for (int i = 0; i < numberOFBanks; i++) {
            System.out.print("Enter bank " + i + "'s total assets:");
            totalAssets[i] = input.nextDouble();


            int numberOfBanksThatBorrowed;
            do {
                System.out.print("Enter the number of banks that borrowed money from bank" + i + ":");
                numberOfBanksThatBorrowed = input.nextInt();
            } while (numberOfBanksThatBorrowed >= numberOFBanks);


            for (int j = 0; j < numberOfBanksThatBorrowed; j++) {

                int idOfTheBank;
                do {
                    System.out.print(" Enter borrowers " + (j + 1) + ". bank ID:");
                    idOfTheBank = input.nextInt();
                } while (idOfTheBank == i || idOfTheBank >= numberOFBanks);
                System.out.print("Amount that borrowed:");
                borrowers[i][idOfTheBank] = input.nextDouble();
            }
        }

        double[] currentBalance = new double[numberOFBanks];

        for (int j = 0; j < numberOFBanks; j++) {
            currentBalance[j] += totalAssets[j];
            for (int k = 0; k < numberOFBanks; k++) {
                currentBalance[j] += borrowers[j][k];
            }
        }
        boolean[] controlOfSafety = isSafety(currentBalance, minimumTotalAsset, numberOFBanks);

        double[] realAmount = new double[numberOFBanks];

        for (int i = 0; i < borrowers.length; i++) {
            realAmount[i] += totalAssets[i];
            for (int j = 0; j < borrowers[0].length; j++) {
                if (controlOfSafety[j]) {
                    realAmount[i] += borrowers[i][j];
                }
            }
        }

        boolean[] isSafetyBank = isSafety(realAmount, minimumTotalAsset, numberOFBanks);

        System.out.print("Unsafe banks are:");

        for (int i = 0; i < isSafetyBank.length; i++) {
            if (!isSafetyBank[i]) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean[] isSafety(double[] currentBalance, double minimumTotalAsset, int numberOFbanks) {
        boolean[] result = new boolean[numberOFbanks];
        for (int i = 0; i < result.length; i++) {
            if (currentBalance[i] > minimumTotalAsset) {
                result[i] = true;
            }
        }
        return result;
    }
}
