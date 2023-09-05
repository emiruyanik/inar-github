package week_05.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        final double TO_POUNDS = 2.2;

        System.out.printf("%-12s  %10s    |    %-12s %12s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        for (int i = 1; i < 101; i++) {
            System.out.printf("%-10d %13.1f    |    %-4d %20.2f\n", (i * 2) - 1, ((i * 2) - 1) * TO_POUNDS, (i * 5) + 15, ((i * 5) + 15) / TO_POUNDS);
        }
    }
}
