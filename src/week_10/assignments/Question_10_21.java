package week_10.assignments;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        String str = Long.MAX_VALUE + "";
        BigInteger bigInteger = new BigInteger(str);
        BigInteger bigInteger5 = new BigInteger("5");
        BigInteger bigInteger6 = new BigInteger("6");

        int counter = 0;
        while (counter != 10) {
            if (bigInteger.mod(bigInteger5).equals(BigInteger.ZERO) || bigInteger.mod(bigInteger6).equals(BigInteger.ZERO)) {
                System.out.println(bigInteger);
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }
}
