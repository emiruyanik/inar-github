package week_08.assignments;

import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] ch = getTheEmptyChars();
        boolean isCompleted = false;

        for (int j = 0; j < 5; j++) {
            printTheBoard(ch);
            int row;
            int column;
            boolean check;
            boolean isWinXPlayer;
            boolean isWinYPlayer;
            do {
                do {
                    System.out.print("Enter a row(0,1 or 2) for player X:");
                    row = input.nextInt();
                } while (!(row < 3 && row >= 0));
                do {
                    System.out.print("Enter a column(0,1 or 2) for player X:");
                    column = input.nextInt();
                } while (!(column < 3 && column >= 0));
                if (ch[row][column] == ' ') {
                    ch[row][column] = 'X';
                    check = true;
                } else {
                    check = false;
                }

            } while (!check);

            isWinXPlayer = isWinXPlayer(ch);
            if (isWinXPlayer) {
                printTheBoard(ch);
                System.out.println("X player won");
                isCompleted = true;
                break;
            }

            if (j < 4) {
                do {
                    printTheBoard(ch);
                    do {
                        System.out.print("Enter a row(0,1 or 2) for player O:");
                        row = input.nextInt();
                    } while (!(row < 3 && row >= 0));
                    do {
                        System.out.print("Enter a column(0,1 or 2) for player O:");
                        column = input.nextInt();
                    } while (!(column < 3 && column >= 0));
                    if (ch[row][column] == ' ') {
                        ch[row][column] = 'O';
                        check = true;
                    } else {
                        check = false;
                    }

                } while (!check);

                isWinYPlayer = isWinYPlayer(ch);
                if (isWinYPlayer) {
                    printTheBoard(ch);
                    System.out.println("O player won");
                    isCompleted = true;
                    break;
                }
            }


        }
        if (!isCompleted) {
            printTheBoard(ch);
            System.out.println("It is a draw");
        }


    }

    public static boolean isWinYPlayer(char[][] ch) {
        boolean rowControl = rowControlO(ch);
        boolean columnControl = columnControlO(ch);
        boolean diagonalControl = diagonalControlO(ch);
        boolean subDiagonalControl = subDiagonalControlO(ch);

        return rowControl || columnControl || diagonalControl || subDiagonalControl;
    }

    public static boolean subDiagonalControlO(char[][] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (i + j != 2) {
                    continue;
                } else {
                    if (ch[i][j] == 'O') {
                        count++;
                    }
                }
            }

        }
        return count == 3;
    }

    public static boolean diagonalControlO(char[][] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i][i] == 'O') {
                count++;
            } else {
                return false;
            }
        }
        return count == 3;
    }

    public static boolean columnControlO(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j][i] == 'O') {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean rowControlO(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i][j] == 'O') {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWinXPlayer(char[][] ch) {

        boolean rowControl = rowControlX(ch);
        boolean columnControl = columnControlX(ch);
        boolean diagonalControl = diagonalControlX(ch);
        boolean subDiagonalControl = subDiagonalControlX(ch);

        return rowControl || columnControl || diagonalControl || subDiagonalControl;
    }

    public static boolean subDiagonalControlX(char[][] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (i + j != 2) {
                    continue;
                } else {
                    if (ch[i][j] == 'X') {
                        count++;
                    }
                }
            }

        }
        return count == 3;
    }

    public static boolean diagonalControlX(char[][] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i][i] == 'X') {
                count++;
            } else {
                return false;
            }
        }
        return count == 3;
    }

    public static boolean columnControlX(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j][i] == 'X') {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean rowControlX(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i][j] == 'X') {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static char[][] getTheEmptyChars() {
        char[][] result = new char[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = ' ';
            }

        }
        return result;
    }

    public static void printTheBoard(char[][] ch) {
        System.out.println("_____________");
        System.out.printf("| %c | %c | %c |\n", ch[0][0], ch[0][1], ch[0][2]);
        System.out.println("_____________");
        System.out.printf("| %c | %c | %c |\n", ch[1][0], ch[1][1], ch[1][2]);
        System.out.println("_____________");
        System.out.printf("| %c | %c | %c |\n", ch[2][0], ch[2][1], ch[2][2]);
        System.out.println("_____________");
    }
}
