package week_08.assignments;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of matrix:");
        int size = input.nextInt();

        int[][] matrix = getMatrix(size);
        printMatrix(matrix);
        rowControl(matrix);
        columnControl(matrix);
        majorDiagonalControl(matrix);
        subDiagonalControl(matrix);
    }

    public static void subDiagonalControl(int[][] matrix) {
        boolean diagonalZero = isSubDiagonalZero(matrix);
        boolean diagonalOne = isSubDiagonalOne(matrix);
        if (diagonalZero) {
            System.out.println("0s are on the sub diagonal");
        } else if (diagonalOne) {
            System.out.println("1s are on the sub diagonal");
        } else {
            System.out.println("No same numbers on the sub diagonal");
        }
    }

    public static boolean isSubDiagonalOne(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j != 3) {
                    continue;
                } else {
                    if (matrix[i][j] != 1) {
                        break;
                    } else {
                        count++;
                    }
                }
            }
        }
        return count == 4;
    }

    public static boolean isSubDiagonalZero(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j != 3) {
                    continue;
                } else {
                    if (matrix[i][j] != 0) {
                        break;
                    } else {
                        count++;
                    }
                }
            }
        }
        return count == 4;
    }

    public static void majorDiagonalControl(int[][] matrix) {
        boolean diagonalZero = isDiagonalZero(matrix);
        boolean diagonalOne = isDiagonalOne(matrix);
        if (diagonalZero) {
            System.out.println("0s are on the major diagonal");
        } else if (diagonalOne) {
            System.out.println("1s are on the major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }

    }

    public static boolean isDiagonalZero(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != j) {
                    continue;
                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    } else {
                        count++;
                    }
                }
            }
        }
        return count == 4;
    }

    public static boolean isDiagonalOne(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != j) {
                    continue;
                } else {
                    if (matrix[i][j] != 1) {
                        return false;
                    } else {
                        count++;
                    }
                }
            }
        }
        return count == 4;
    }

    public static void columnControl(int[][] matrix) {
        boolean isColumnZero;
        boolean isColumnOne;
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            isColumnZero = isColumnZero(matrix, i);
            isColumnOne = isColumnOne(matrix, i);

            if (isColumnZero) {
                System.out.println("All 0s are on the column" + i);
                count++;
            }
            if (isColumnOne) {
                System.out.println("All 1s are on the column" + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a column");
        }

    }

    public static boolean isColumnZero(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][i] != 0) {
                return false;
            } else {
                count++;
            }
        }
        return count == 4;
    }

    public static boolean isColumnOne(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][i] != 1) {
                return false;
            } else {
                count++;
            }
        }
        return count == 4;
    }

    public static void rowControl(int[][] matrix) {
        boolean isRowZero;
        boolean isRowOne;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            isRowZero = isRowZero(matrix, i);
            isRowOne = isRowOne(matrix, i);

            if (isRowZero) {
                System.out.println("All 0s are on the row" + i);
                count++;
            }
            if (isRowOne) {
                System.out.println("All 1s are on the row" + i);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }


    }

    public static boolean isRowOne(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] != 1) {
                return false;
            } else {
                count++;
            }
        }
        return count == 4;
    }

    public static boolean isRowZero(int[][] matrix, int i) {
        int count = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[i][j] != 0) {
                return false;
            } else {
                count++;
            }
        }
        return count == 4;
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMatrix(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                int randomNumber = (int) (Math.random() * 2);
                result[i][j] = randomNumber;
            }
        }
        return result;
    }
}
