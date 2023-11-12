package week_10.assignments;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        String maxValueOfLong = Long.MAX_VALUE + "";
        BigInteger bigInteger = new BigInteger(maxValueOfLong);
//        BigInteger bigInteger1=new BigInteger("2");
//        System.out.println(bigInteger1.compareTo(bigInteger.sqrt()));

        int counter = 0;
        while (counter != 5) {
            boolean check = true;
            for (BigInteger i = new BigInteger("2"); i.compareTo(bigInteger.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
                if (bigInteger.mod(i).equals(BigInteger.ZERO)) {
                    check = false;
                    break;
                }


            }
            if (check) {
                System.out.println(bigInteger);
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);

        }
    }
}
