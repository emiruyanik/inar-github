package week_08.assignments;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {


        System.out.println("Enter the sudoku solution:");
        int[][] sudoku = getTheSudokuSolution();
        System.out.println((checkTheSudokuSolution(sudoku)) ? "Valid solution" : "Invalid solution");
    }

    public static boolean checkTheSudokuSolution(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] > 9 || sudoku[i][j] < 1 || checkTheSudokuSolution(i, j, sudoku)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkTheSudokuSolution(int row, int column, int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            if (i != column && sudoku[row][column] == sudoku[row][i]) {
                return false;
            }
        }
        for (int i = 0; i < sudoku.length; i++) {
            if (i != row && sudoku[row][column] == sudoku[i][column]) {
                return false;
            }
        }
        for (int i = row; i < ((row / 3) * 3) + 3; i++) {
            for (int j = column; j < ((column / 3) * 3) + 3; j++) {
                if (i != row && j != column && sudoku[row][column] == sudoku[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static int[][] getTheSudokuSolution() {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[9][9];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = input.nextInt();
            }

        }
        return result;
    }
}
