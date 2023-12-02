package week_13.assignments;

import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number:");
        double real1 = input.nextDouble();
        double imiginary1 = input.nextDouble();

        System.out.print("Enter the second complex number:");
        double real2 = input.nextDouble();
        double imiginary2 = input.nextDouble();

        Complex complex1 = new Complex(real1, imiginary1);
        Complex complex2 = new Complex(real2, imiginary2);
        Complex add = complex1.add(complex2);
        Complex subtract = complex1.subtract(complex2);
        Complex multiply = complex1.multiply(complex2);
        Complex divide = complex1.divide(complex2);
        double abs = complex1.abs();

        System.out.println("(" + complex1 + ")" + "+" + "(" + complex2 + ")" + "=" + add);
        System.out.println("(" + complex1 + ")" + "-" + "(" + complex2 + ")" + "=" + subtract);
        System.out.println("(" + complex1 + ")" + "*" + "(" + complex2 + ")" + "=" + multiply);
        System.out.println("(" + complex1 + ")" + "/" + "(" + complex2 + ")" + "=" + divide);
        System.out.println("|(" + complex1 + ")|" + "=" + abs);
    }
}
