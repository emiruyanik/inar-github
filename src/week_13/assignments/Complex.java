package week_13.assignments;

public class Complex implements Cloneable {
    private double a;
    private double b;

    Complex() {
        this.a = 0;
        this.b = 0;
    }

    Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex c2) {
        double newA = this.getRealPart() + c2.getRealPart();
        double newB = this.getImaginaryPart() + c2.getImaginaryPart();

        return new Complex(newA, newB);
    }

    public Complex subtract(Complex c2) {
        double newA = this.getRealPart() - c2.getRealPart();
        double newB = this.getImaginaryPart() - c2.getImaginaryPart();

        return new Complex(newA, newB);

    }

    public Complex multiply(Complex c2) {
        double newA = (this.getRealPart() * c2.getRealPart()) - (this.getImaginaryPart() * c2.getImaginaryPart());
        double newB = (this.getImaginaryPart() * c2.getRealPart()) + (this.getRealPart() * c2.getImaginaryPart());

        return new Complex(newA, newB);
    }

    public Complex divide(Complex c2) {
        double newA = ((this.getRealPart() * c2.getRealPart()) + (this.getImaginaryPart() * c2.getImaginaryPart())) * (Math.pow(c2.getRealPart(), 2) +
                Math.pow(c2.getImaginaryPart(), 2));
        double newB = ((this.getImaginaryPart() * c2.getRealPart()) - (this.getRealPart() * c2.getImaginaryPart())) * (Math.pow(c2.getRealPart(), 2) +
                Math.pow(c2.getImaginaryPart(), 2));

        return new Complex(newA, newB);
    }

    public double abs() {
        return Math.sqrt(Math.pow(this.getImaginaryPart(), 2) + Math.pow(this.getRealPart(), 2));
    }

    @Override
    public Complex clone() {
        try {
            Complex clone = (Complex) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        if (this.getImaginaryPart() == 0) {
            return this.getRealPart() + "";
        }
        return this.getRealPart() + "+" + "(" + this.getImaginaryPart() + "i" + ")";
    }
}
