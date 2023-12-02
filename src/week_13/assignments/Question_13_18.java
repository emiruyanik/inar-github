package week_13.assignments;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {
        FixedRational fixedRational = new FixedRational(new BigInteger("1"), new BigInteger("2"));
        for (BigInteger i = new BigInteger("2"); i.compareTo(new BigInteger("99")) <= 0; i = i.add(new BigInteger("1"))) {
           fixedRational=fixedRational.add(new FixedRational(i,i.add(new BigInteger("1"))));

        }
        System.out.println(fixedRational);
    }
}
