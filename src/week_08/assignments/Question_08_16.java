package week_08.assignments;

public class Question_08_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void sort(int[][] array) {
        sortOfRow(array);
        sortOfColumn(array);
    }

    public static void sortOfColumn(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinRow = array[i][0];
            int currentMinColumn = array[i][1];
            int indexOfCurrentMinColumn = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMinRow == array[j][0]) {
                    if (currentMinColumn > array[j][1]) {
                        currentMinColumn = array[j][1];
                        indexOfCurrentMinColumn = j;
                    }
                }
            }
            if (indexOfCurrentMinColumn != i) {
                array[indexOfCurrentMinColumn][1] = array[i][1];
                array[i][1] = currentMinColumn;
            }
        }
    }

    public static void sortOfRow(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinRow = array[i][0];
            int currentMinColumn = array[i][1];
            int indexOfCurrentMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j][0] < currentMinRow) {
                    currentMinRow = array[j][0];
                    currentMinColumn = array[j][1];
                    indexOfCurrentMin = j;
                }
            }
            if (indexOfCurrentMin != i) {
                array[indexOfCurrentMin][0] = array[i][0];
                array[indexOfCurrentMin][1] = array[i][1];

                array[i][0] = currentMinRow;
                array[i][1] = currentMinColumn;
            }
        }

    }
}
