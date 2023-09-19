package week_06.assignments;

public class Question_06_15 {
    public static void main(String[] args) {

        System.out.printf("%-18s %-18s %-18s %-18s %-18s\n", "Taxable", "Single", "Married Joint",
                "Married", "Head of");
        System.out.printf("%-18s %-18s %-18s %-18s %-18s\n", "income", "", "or qualifying",
                "Separate", "a house");
        System.out.printf("%-18s %-18s %-18s %-18s %-18s\n", "", "", "widow(er)",
                "", "");
        System.out.print("___________________________________________________________________________________\n");
        for (int i = 50000; i <= 60000; i += 50) {

            for (int j = 0; j < 1; j++) {
                System.out.printf("%-19d", i);
            }

            for (int j = 0; j <= 3; j++) {

                System.out.printf("%-19d", Math.round(computeTax(j, i)));
            }
            System.out.println();
        }

    }

    public static double computeTax(int status, int taxableIncome) {
        double tax = 0;
        switch (status) {
            case 0:
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
                break;
            case 1:
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                break;
            case 2:
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
                break;
            case 3:
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (taxableIncome - 45500) * 0.25;
                break;

        }
        return tax;

    }
}
