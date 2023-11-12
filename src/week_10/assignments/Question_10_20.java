package week_10.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.printf("%-32s %-32s\n", "i", "e");
        System.out.println("_________________________________________________________________");

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal bigDecimalConstant = new BigDecimal(1);
            BigDecimal bigDecimalAdded = new BigDecimal(1);

            for (int j = 1; j <= i; j++) {
                BigDecimal bigDecimalFactorialMultiply = new BigDecimal(1);
                for (int k = 1; k <= j; k++) {
                    bigDecimalFactorialMultiply = bigDecimalFactorialMultiply.multiply(new BigDecimal(k));
                }
                bigDecimalAdded = bigDecimalAdded.add(bigDecimalConstant.divide(bigDecimalFactorialMultiply, 30, RoundingMode.HALF_UP));
            }
            System.out.printf("%-32d %-32.30f\n", i, bigDecimalAdded);

        }
    }
}
