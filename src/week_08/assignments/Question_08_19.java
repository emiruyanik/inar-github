package week_08.assignments;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number:");
        int rowNumber = input.nextInt();

        System.out.print("Enter column number:");
        int columnNumber = input.nextInt();

        int[][] array = createAndFillTheArray(rowNumber, columnNumber);

        boolean isConsecutive = isConsecutive(array);
        System.out.println((isConsecutive) ? "Matrix has consecutive four numbers" : "Matrix has not consecutive four numbers");
    }

    public static boolean isConsecutive(int[][] array) {
        boolean checkRow = checkRow(array);
        boolean checkColumn = checkColumn(array);
        boolean checkDiagonal = checkDiagonal(array);

        return checkDiagonal || checkColumn || checkRow;
    }

    public static boolean checkDiagonal(int[][] array) {
        boolean checkFromLeftToTheRight = checkFromLeftToTheRight(array);
        boolean checkFromRightToTheLeft = checkFromRightToTheLeft(array);

        return checkFromLeftToTheRight || checkFromRightToTheLeft;
    }

    public static boolean checkFromRightToTheLeft(int[][] array) {
        boolean check = false;
        for (int i = 0; i <= (array.length % 4); i++) {
            for (int j = array[0].length - 1; j >= (array[0].length - 1) - (array[0].length % 4); j--) {
                int number = array[i][j];
                int counterRow = i;
                int counterColumn = j;

                int counter = 1;
                for (int k = 0; k < 3; k++) {
                    if (number == array[counterRow][counterColumn]) {
                        counter++;
                        counterRow++;
                        counterColumn--;
                    }

                }
                if (counter == 4) {
                    check = true;
                    return check;
                }
            }
        }
        return check;
    }

    public static boolean checkFromLeftToTheRight(int[][] array) {
        boolean check = false;
        for (int i = 0; i <= (array.length % 4); i++) {
            for (int j = 0; j <= array[0].length % 4; j++) {
                int number = array[i][j];
                int counterRow = i;
                int counterColumn = j;

                int counter = 1;
                for (int k = 0; k < 3; k++) {
                    if (number == array[counterRow][counterColumn]) {
                        counter++;
                        counterRow++;
                        counterColumn++;
                    }

                }
                if (counter == 4) {
                    check = true;
                    return check;
                }
            }
        }
        return check;
    }

    public static boolean checkColumn(int[][] array) {
        boolean check = false;
        int min = Math.min(array.length, array[0].length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                int counter = 1;
                int number = array[j][i];
                for (int k = j + 1; k < min; k++) {
                    if (number == array[k][i]) {
                        counter++;
                    } else {
                        break;
                    }

                }
                if (counter == 4) {
                    check = true;
                    return check;
                }
            }
        }
        return false;
    }

    public static boolean checkRow(int[][] array) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int counter = 1;
                int numb = array[i][j];
                for (int k = j + 1; k < array[0].length; k++) {
                    if (numb == array[i][k]) {
                        counter++;
                    } else {
                        break;
                    }
                }
                if (counter == 4) {
                    check = true;
                    return check;
                }
            }
        }
        return false;
    }


    public static int[][] createAndFillTheArray(int rowNumber, int columnNumber) {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[rowNumber][columnNumber];
        System.out.println("Fill the matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }
}
