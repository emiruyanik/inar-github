package week_09.assignments;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);

    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {

            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
        return 0;
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {

            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }

        return 0;
    }

}



