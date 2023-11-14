package week_10.assignments;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {
        String str = Long.MAX_VALUE + "";
        BigInteger bigIntegerMax = new BigInteger(str);
        bigIntegerMax = bigIntegerMax.sqrt();

        String square = bigIntegerMax.toString();

        BigInteger bigIntegerSquare = new BigInteger(square);
        bigIntegerSquare = bigIntegerSquare.add(BigInteger.ONE);

        for (int i = 0; i < 10; i++) {
            System.out.println(bigIntegerSquare.pow(2));
            bigIntegerSquare = bigIntegerSquare.add(BigInteger.ONE);
        }

    }
}
