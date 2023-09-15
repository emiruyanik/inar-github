package week_06.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.printf("%-13s %-3s", "i", "(m)i\n");
        System.out.println("_____________________");
        for (int i = 1; i <= 20; i++) {

            System.out.printf("%-13d %-3.4f\n", i, formula(i));

        }
    }

    public static double formula(int i) {
        double total = 0;
        for (int j = 1; j <= i; j++) {
            total += j / (j + 1.0);
        }
        return total;
    }
}
