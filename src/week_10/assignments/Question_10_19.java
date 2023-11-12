package week_10.assignments;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.printf("%-30c %-30s\n", 'p', "2^p-1");
        while (counter != 5) {
            for (int i = 2; i <= 100; i++) {
                BigInteger bigInteger = new BigInteger("2");
                bigInteger = bigInteger.pow(i);
                bigInteger = bigInteger.subtract(BigInteger.ONE);
                if (isPrime(bigInteger)) {
                    System.out.printf("%-30d %-30d\n", i, bigInteger);
                    counter++;
                }

            }
        }
    }

    private static boolean isPrime(BigInteger bigInteger) {
        boolean check = true;
        for (BigInteger i = new BigInteger("2"); i.compareTo(bigInteger.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if (bigInteger.mod(i).equals(BigInteger.ZERO)) {
                check = false;
                break;
            }


        }
        return check;
    }
}