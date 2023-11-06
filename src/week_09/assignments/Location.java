package week_09.assignments;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location() {
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;


    }

    public static Location locateLargest(double[][] matrix) {

        double maxValue = matrix[0][0];
        int row = 0;
        int column = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, maxValue);


    }
}