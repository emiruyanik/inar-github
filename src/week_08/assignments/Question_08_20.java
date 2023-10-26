package week_08.assignments;

import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] ch = new char[6][7];
        makeEmptyChars(ch);
        boolean isWinForRed = false;
        boolean isWinForYellow = false;
        for (int i = 0; i < 22; i++) {
            printTheBoard(ch);
            System.out.print("Drop a red disk at column (0-6):");
            int column;
            do {
                column = input.nextInt();
            } while (!(column >= 0 && column <= 6));

            boolean isEmpty = false;
            int row = 5;
            do {

                if (ch[row][column] == ' ') {
                    ch[row][column] = 'R';
                    isEmpty = true;
                } else {
                    row--;
                }
                if (row < 0) {
                    System.out.print("Enter a different column:");
                    row = 5;
                    do {
                        column = input.nextInt();
                    } while (!(column >= 0 && column <= 6));
                }

            } while (!isEmpty);
            isWinForRed = isWinForRed(ch);

            if (isWinForRed) {
                printTheBoard(ch);
                System.out.println("The red player won");
                break;
            }

            printTheBoard(ch);
            System.out.print("Drop a yellow disk at column (0-6):");
            do {
                column = input.nextInt();
            } while (!(column >= 0 && column <= 6));

            isEmpty = false;
            row = 5;
            do {

                if (ch[row][column] == ' ') {
                    ch[row][column] = 'Y';
                    isEmpty = true;
                } else {
                    row--;
                }
                if (row < 0) {
                    System.out.print("Enter a different column:");
                    row = 5;
                    do {
                        column = input.nextInt();
                    } while (!(column >= 0 && column <= 6));
                }

            } while (!isEmpty);
            isWinForYellow = isWinForYellow(ch);

            if (isWinForYellow) {
                printTheBoard(ch);
                System.out.println("The yellow player won");
                break;
            }
        }
        if (!(isWinForRed || isWinForYellow)) {
            printTheBoard(ch);
            System.out.println("DRAW");
        }
    }

    public static boolean isWinForYellow(char[][] ch) {
        boolean isConsecutiveYellowFromLeft = isConsecutiveYellowFromLeft(ch);
        boolean isConsecutiveYellowFromRight = isConsecutiveYellowFromRight(ch);

        return isConsecutiveYellowFromLeft || isConsecutiveYellowFromRight;
    }

    public static boolean isConsecutiveYellowFromRight(char[][] ch) {
        boolean control;
        for (int i = ch.length - 1; i >= ch.length - 3; i--) {
            for (int j = ch[0].length - 1; j >= ch[0].length - 3; j--) {
                control = controlThePositionOfYellowFromRight(i, j, ch);
                if (control) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean controlThePositionOfYellowFromRight(int i, int j, char[][] ch) {
        boolean isConsecutiveFourYellowForRowFromRight = isConsecutiveFourYellowForRowFromRight(i, j, ch);
        boolean isConsecutiveFourYellowForColumnFromRight = isConsecutiveFourYellowForColumnFromRight(i, j, ch);
        boolean isConsecutiveFourYellowForDiagonalFromRight = isConsecutiveFourYellowForDiagonalFromRight(i, j, ch);

        return isConsecutiveFourYellowForRowFromRight || isConsecutiveFourYellowForColumnFromRight || isConsecutiveFourYellowForDiagonalFromRight;
    }

    public static boolean isConsecutiveFourYellowForDiagonalFromRight(int i, int j, char[][] ch) {
        for (int k = 0; k < 4; k++) {
            if (ch[i][j] != 'Y') {
                return false;
            } else {
                i--;
                j--;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourYellowForColumnFromRight(int i, int j, char[][] ch) {
        for (int k = i; k > i - 4; k--) {
            if (ch[k][j] != 'Y') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourYellowForRowFromRight(int i, int j, char[][] ch) {
        for (int k = j; k > j - 4; k--) {
            if (ch[i][k] != 'Y') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveYellowFromLeft(char[][] ch) {
        boolean control;
        for (int i = ch.length - 1; i >= ch.length - 3; i--) {
            for (int j = 0; j < ch[0].length - 3; j++) {
                control = controlThePositionOfYellowFromLeft(i, j, ch);
                if (control) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean controlThePositionOfYellowFromLeft(int i, int j, char[][] ch) {
        boolean isConsecutiveFourYellowForRowFromLeft = isConsecutiveFourYellowForRowFromLeft(i, j, ch);
        boolean isConsecutiveFourYellowForColumnFromLeft = isConsecutiveFourYellowForColumnFromLeft(i, j, ch);
        boolean isConsecutiveFourYellowForDiagonalFromLeft = isConsecutiveFourYellowForDiagonalFromLeft(i, j, ch);

        return isConsecutiveFourYellowForRowFromLeft || isConsecutiveFourYellowForColumnFromLeft || isConsecutiveFourYellowForDiagonalFromLeft;
    }

    public static boolean isConsecutiveFourYellowForDiagonalFromLeft(int i, int j, char[][] ch) {
        for (int k = 0; k < 4; k++) {
            if (ch[i][j] != 'Y') {
                return false;
            } else {
                i--;
                j++;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourYellowForColumnFromLeft(int i, int j, char[][] ch) {
        for (int k = i; k > i - 4; k--) {
            if (ch[k][j] != 'Y') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourYellowForRowFromLeft(int i, int j, char[][] ch) {
        for (int k = j; k < j + 4; k++) {
            if (ch[i][k] != 'Y') {
                return false;
            }
        }
        return true;
    }

    public static boolean isWinForRed(char[][] ch) {
        boolean isConsecutiveRedFromLeft = isConsecutiveRedFromLeft(ch);
        boolean isConsecutiveRedFromRight = isConsecutiveRedFromRight(ch);

        return isConsecutiveRedFromLeft || isConsecutiveRedFromRight;
    }

    public static boolean isConsecutiveRedFromRight(char[][] ch) {
        boolean control;
        for (int i = ch.length - 1; i >= ch.length - 3; i--) {
            for (int j = ch[0].length - 1; j >= ch[0].length - 3; j--) {
                control = controlThePositionOfRedFromRight(i, j, ch);
                if (control) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean controlThePositionOfRedFromRight(int i, int j, char[][] ch) {
        boolean isConsecutiveFourRedForRowFromRight = isConsecutiveFourRedForRowFromRight(i, j, ch);
        boolean isConsecutiveFourRedForColumnFromRight = isConsecutiveFourRedForColumnFromRight(i, j, ch);
        boolean isConsecutiveFourRedForDiagonalFromRight = isConsecutiveFourRedForDiagonalFromRight(i, j, ch);

        return isConsecutiveFourRedForRowFromRight || isConsecutiveFourRedForColumnFromRight || isConsecutiveFourRedForDiagonalFromRight;
    }

    public static boolean isConsecutiveFourRedForDiagonalFromRight(int i, int j, char[][] ch) {
        for (int k = 0; k < 4; k++) {
            if (ch[i][j] != 'R') {
                return false;
            } else {
                i--;
                j--;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourRedForColumnFromRight(int i, int j, char[][] ch) {
        for (int k = i; k > i - 4; k--) {
            if (ch[k][j] != 'R') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourRedForRowFromRight(int i, int j, char[][] ch) {
        for (int k = j; k > j - 4; k--) {
            if (ch[i][k] != 'R') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveRedFromLeft(char[][] ch) {
        boolean control;
        for (int i = ch.length - 1; i >= ch.length - 3; i--) {
            for (int j = 0; j < ch[0].length - 3; j++) {
                control = controlThePositionOfRedFromLeft(i, j, ch);
                if (control) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean controlThePositionOfRedFromLeft(int i, int j, char[][] ch) {
        boolean isConsecutiveFourRedForRowFromLeft = isConsecutiveFourRedForRowFromLeft(i, j, ch);
        boolean isConsecutiveFourRedForColumnFromLeft = isConsecutiveFourRedForColumnFromLeft(i, j, ch);
        boolean isConsecutiveFourRedForDiagonalFromLeft = isConsecutiveFourRedForDiagonalFromLeft(i, j, ch);

        return isConsecutiveFourRedForRowFromLeft || isConsecutiveFourRedForColumnFromLeft || isConsecutiveFourRedForDiagonalFromLeft;
    }

    public static boolean isConsecutiveFourRedForDiagonalFromLeft(int i, int j, char[][] ch) {
        for (int k = 0; k < 4; k++) {
            if (ch[i][j] != 'R') {
                return false;
            } else {
                i--;
                j++;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourRedForColumnFromLeft(int i, int j, char[][] ch) {
        for (int k = i; k > i - 4; k--) {
            if (ch[k][j] != 'R') {
                return false;
            }
        }
        return true;
    }

    public static boolean isConsecutiveFourRedForRowFromLeft(int i, int j, char[][] ch) {
        for (int k = j; k < j + 4; k++) {
            if (ch[i][k] != 'R') {
                return false;
            }
        }
        return true;
    }

    public static void printTheBoard(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                System.out.printf("|%c", ch[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void makeEmptyChars(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                ch[i][j] = ' ';
            }
        }
    }
}
