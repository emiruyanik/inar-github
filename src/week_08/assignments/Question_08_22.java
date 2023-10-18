package week_08.assignments;

public class Question_08_22 {
    public static void main(String[] args) {
        int[][] matrix = getRandomArray();
        printArray(matrix);

        boolean haveEvenNumberInARow = haveEvenNumberInARow(matrix);
        System.out.println((haveEvenNumberInARow) ? "Every row have an even number of 1's" : " Every row have not an even number of 1's");

        boolean haveEvenNumberInAColumn = haveEvenNumberInAColumn(matrix);
        System.out.println((haveEvenNumberInAColumn) ? "Every column have an even number of 1's" : " Every column have not an even number of 1's");
    }

    public static boolean haveEvenNumberInAColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveEvenNumberInARow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] getRandomArray() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
