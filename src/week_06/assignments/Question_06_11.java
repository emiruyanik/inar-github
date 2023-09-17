package week_06.assignments;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.printf("%-13s %-13s\n", "SalesAmount", "Commission");
        System.out.print("_______________________________\n");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-13d %-13.1f\n", i, computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount) {
        if (salesAmount <= 5000) {
            return salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            return 400 + (salesAmount - 5000) * 0.10;
        } else {
            return 900 + (salesAmount - 10000) * 0.12;
        }
    }
}
