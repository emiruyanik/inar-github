package week_08.assignments;

import static week_08.assignments.Question_08_26.printArray;

public class Question_08_27 {
    public static void main(String[] args) {

        double[][] array = Question_08_25.getArray(3, 3);
        double[][] sortColumns = sortColumns(array);

        System.out.println("The column sorted array is:");
        printArray(sortColumns);

    }

    public static double[][] sortColumns(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                double min = array[j][i];
                int indexOfMin = j;
                for (int k = j + 1; k < array[0].length; k++) {
                    if (min > array[k][i]) {
                        min = array[k][i];
                        indexOfMin = k;
                    }
                }
                if (indexOfMin != j) {
                    array[indexOfMin][i] = array[j][i];
                    array[j][i] = min;
                }
            }
        }
        return array;
    }
}
