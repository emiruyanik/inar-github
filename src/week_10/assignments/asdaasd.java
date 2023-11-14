package week_10.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class asdaasd {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(10000000000L);
        System.out.println(bigDecimal.divide(bigDecimal1));
        String s1 = "abcdefbcda";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));
        String s3 = s1.concat(s2);
        System.out.println(s3);
        char[]chars={'a','b','c'};
        String s= Arrays.toString(chars);
        System.out.println(s);
        System.out.println("_____________________________________________-");

       String str=Long.MAX_VALUE+"";
        System.out.println(str);
        BigInteger bigInteger=new BigInteger(str);
        System.out.println(bigInteger.sqrt());
        bigInteger=bigInteger.sqrt();
        bigInteger=bigInteger.add(BigInteger.ONE);
        bigInteger=bigInteger.pow(2);
        System.out.println(bigInteger);


    }
}
