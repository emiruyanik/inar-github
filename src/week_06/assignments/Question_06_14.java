package week_06.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.printf("%-13s %-3s\n", "i", "(m)i");
        System.out.print("____________________________\n");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-13d %-3.4f\n", i, approximatePiCalculation(i));

        }


    }

    public static double approximatePiCalculation(int i) {
        double total = 0;
        for (int j = 1; j <= i; j++) {
            total += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * total;
    }
}
