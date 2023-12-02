package week_13.assignments;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b,c;");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = findDiscriminant(a, b, c);
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
            System.out.println("root1-->" + r1);
            System.out.println("root2-->" + r2);
        } else if (discriminant == 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            System.out.println("root1-->" + r1);
        } else {
            double delta1 = Math.sqrt(-discriminant) / 2 * a;

            Complex complex1=new Complex(-b/2*a,-delta1/2*a);
            Complex complex2=new Complex(-b/2*a,delta1/2*a);

            System.out.println("root1-->" + complex1);
            System.out.println("root2-->" + complex2);
        }
    }

    public static double findDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}
