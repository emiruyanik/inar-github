package week_08.assignments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 0, 0, 1},
        };
        int maxRowIndex = maxRow(matrix);
        int maxColumnIndex = maxColumnIndex(matrix);
        System.out.println("The largest row index is " + maxRowIndex);
        System.out.println("The largest column index is " + maxColumnIndex);
    }

    public static int maxRow(int[][] matrix) {
        int currentMaxRow = 0;
        int currentMaxRowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            currentMaxRow += matrix[i][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            int maxRow = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                maxRow += matrix[i][j];
            }
            if (maxRow > currentMaxRow) {
                currentMaxRowIndex = i;
            }
        }
        return currentMaxRowIndex;
    }

    public static int maxColumnIndex(int[][] matrix) {
        int currentMaxColumn = 0;
        int maxColumnIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            currentMaxColumn += matrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            int maxColumn = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                maxColumn += matrix[j][i];
            }
            if (maxColumn > currentMaxColumn) {
                maxColumnIndex = i;
            }

        }
        return maxColumnIndex;
    }
}
