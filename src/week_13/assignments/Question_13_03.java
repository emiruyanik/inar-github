package week_13.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Question_13_03 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(125);
        numbers.add(16.4);
        numbers.add(new BigInteger("125454136557453"));
        numbers.add(new BigDecimal(1244545512578874.455241447855));
        numbers.add(124478551455L);
        numbers.add(7854.4545);

        System.out.println("Before sorted:");
        System.out.println((numbers));

        sort(numbers);

        System.out.println("After sorted:");
        System.out.println((numbers));
    }

    public static void sort(ArrayList<Number> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentMinIndex = i;
            Number min = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j).doubleValue() < min.doubleValue()) {
                    currentMinIndex = j;
                    min = numbers.get(j);
                }
            }
            if (currentMinIndex != i) {
                numbers.set(currentMinIndex, numbers.get(i));
                numbers.set(i, min);
            }
        }
    }
}
