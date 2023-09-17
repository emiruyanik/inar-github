package week_06.assignments;

public class Question_06_01 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            int pentagonalNumber = getPentagonalNumber(i);
            counter++;
            if (counter % 10 == 0) {
                System.out.println(pentagonalNumber);
            } else {
                System.out.printf(pentagonalNumber + " ");
            }
        }

    }

    public static int getPentagonalNumber(int number) {
        int result = 0;
        result = number * (3 * number - 1) / 2;
        return result;
    }
}


