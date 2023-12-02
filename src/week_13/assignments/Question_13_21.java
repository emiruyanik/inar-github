package week_13.assignments;

import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c;");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        long r = (long) (-b);

        long xSquareUp = (long) (a * (Math.pow(r, 2)));
        long xSquareDown = (long) (Math.pow(2 * a, 2));
        Rational rationalSquare = new Rational(xSquareUp, xSquareDown);

        long normalXUp = (long) (r * b);
        long normalXDown = (long) (2 * a);
        Rational rationalNormalX = new Rational(normalXUp, normalXDown);

        Rational rationalC = new Rational((long) c, 1);
        Rational k = rationalSquare.add(rationalNormalX).add(rationalC);
        Rational h = new Rational(r, (long) (2 * a));

        System.out.println("h-->" + h);
        System.out.println("k-->" + k);

    }
}
