package week_08.assignments;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int tempRow = array[i][0];
            int tempColumn = array[i][1];

            int randomNumber = (int) (Math.random() * array.length);
            array[i][0] = array[randomNumber][0];
            array[i][1] = array[randomNumber][1];

            array[randomNumber][0] = tempRow;
            array[randomNumber][1] = tempColumn;
        }
    }
}
