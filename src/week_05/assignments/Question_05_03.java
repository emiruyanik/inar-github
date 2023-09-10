package week_05.assignments;

public class Question_05_03 {
    public static void main(String[] args) {
        final double TO_POUNDS = 2.2;

        System.out.printf("%-13s %13s\n", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%-13d %13.1f\n", i, i * TO_POUNDS);

        }
    }
}
