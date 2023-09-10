package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {


        for (int j = 10000; j <= 100000; j += 10000) {
            double multi = 1;
            double e = 1;

            for (int i = 1; i < j; i++) {
                multi = multi * (1.0 / i);
                e = e + multi;

            }
            System.out.printf("e at %d is %.15f\n", j, e);
        }
    }
}