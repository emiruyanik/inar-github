package week_05.assignments;


public class Question_05_06 {
    public static void main(String[] args) {
        final double TO_KILOMETERS = 1.609;


        System.out.printf("%-13s %13s    | %13s %13s ", "Miles", "Kilometers", "Kilometers", "Miles");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%-13d %13.3f    | %13d %13.3f", i, i * TO_KILOMETERS, (i * 5) + 15, ((i * 5) + 15) / TO_KILOMETERS);
        }
    }
}
