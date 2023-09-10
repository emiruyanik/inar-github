package week_05.assignments;

public class Question_05_25 {
    public static void main(String[] args) {

        double stableOneValue = 1.0;
        int counter = 0;
        double pi = 0;


        for (int i = 10000; i <= 100000; i += 10000) {
            for (int j = 1; j <= i; j++) {

                stableOneValue = stableOneValue - (1.0 / ((4 * j) - 1));
                stableOneValue = stableOneValue + (1.0 / ((4 * j) + 1));
                counter++;


            }
            if (counter % 10000 == 0) {
                pi = 4 * stableOneValue;
                System.out.println("PI value for: " + i + "  " + pi);
                stableOneValue = 1.0;

            }
        }
    }
}
