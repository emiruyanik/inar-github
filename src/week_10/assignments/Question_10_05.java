package week_10.assignments;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stackOfIntegers = new StackOfIntegers();

        System.out.print("Enter a positive integer:");
        int value = input.nextInt();
        int dividedvalue = value;

        if (!MyInteger.isPrime(value)) {
            while (dividedvalue != 1) {
                for (int i = 2; i <= value / 2; i++) {
                    if (dividedvalue % i == 0) {
                        stackOfIntegers.push(i);
                        dividedvalue = dividedvalue / i;
                    }
                }
            }
        }
        System.out.println(stackOfIntegers.getSize());
        int loopvalue=stackOfIntegers.getSize();
        System.out.print("Decreasing order:");
        for (int i = 0; i < loopvalue; i++) {
            System.out.print(stackOfIntegers.pop() + " ");
        }


    }
}
