package week_05.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double currentTuition = 10000;
        double tenthYearTuition = 0;

        for (int i = 1; i <= 10; i++) {

            currentTuition = currentTuition + currentTuition * (5.0 / 100);
            if (i == 10) {
                tenthYearTuition = currentTuition;
            }

        }

        double tuitionAfterTheTenYears = tenthYearTuition;
        System.out.printf("The tuition in ten years is %.2f\n", tenthYearTuition);

        double costOfFourYears = 0;

        for (int i = 1; i <= 4; i++) {
            tuitionAfterTheTenYears = tuitionAfterTheTenYears + (tuitionAfterTheTenYears * (5.0 / 100));
            costOfFourYears += tuitionAfterTheTenYears;


        }
        System.out.printf("The total cost of four years after the ten years is %.2f", costOfFourYears);
    }

}
