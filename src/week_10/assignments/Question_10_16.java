package week_10.assignments;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append("0".repeat(49));
        String value = stringBuilder.toString();
        BigInteger bigInteger = new BigInteger(value);

        int count = 0;
        while (count != 10) {
            BigInteger bigInteger2 = new BigInteger("2");
            BigInteger bigInteger3 = new BigInteger("3");

            BigInteger modTo2 = bigInteger.mod(bigInteger2);
            BigInteger modTo3 = bigInteger.mod(bigInteger3);

            int value1 = modTo2.intValue();
            int value2 = modTo3.intValue();

            if (value1 == 0 || value2 == 0) {
                System.out.println(bigInteger);
                count++;
                bigInteger = bigInteger.add(BigInteger.ONE);
            } else {
                bigInteger = bigInteger.add(BigInteger.ONE);

            }
        }
    }
}
