package week_05.assignments;

public class Question_05_04 {
    public static void main(String[] args) {
        final double TO_KILOMETERS = 1.609;

        System.out.printf("%-10s %12s\n", "MILES", "KILOMETERS");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d %12.3f\n", i, i * TO_KILOMETERS);
        }
    }
}
