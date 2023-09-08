package week_05.assignments;

public class Question_05_33 {
    public static void main(String[] args) {

        int number = 2;
        final int PERFECT_NUMBERS = 4;
        int totalPerfectNumbers = 0;

        while (totalPerfectNumbers < PERFECT_NUMBERS) {
            int total = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    total = total + i;
                }
            }
            if (total == number) {
                System.out.println(number);
                totalPerfectNumbers++;
            }
            number++;
        }
    }
}
