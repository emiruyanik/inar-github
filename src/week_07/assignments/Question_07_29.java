package week_07.assignments;

public class Question_07_29 {
    public static void main(String[] args) {
        int[] cards = new int[52];
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int total;
        do {
            total = 0;
            int[] indexes = {0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                int randomNumber = (int) (Math.random() * 52);
                indexes[i] = randomNumber % 13;
                total += values[randomNumber % 13];


            }
            if (total == 24) {
                for (int i = 0; i < indexes.length; i++) {
                    System.out.print(names[indexes[i]] + " ");
                }
            }
        } while (total != 24);

    }
}
