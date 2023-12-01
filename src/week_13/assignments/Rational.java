package week_13.assignments;

public class Rational extends Number implements Comparable{

    private long[]r=new long[2];

    public Rational() {
        r[0]=0;
        r[1]=1;
    }

    public Rational(long numerator,long denominator) {
        long gcd = gcd(numerator,denominator);
        this.r[0] = ((denominator > 0) ? 1 : -1) *numerator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    private long gcd(long n,long d) {
        long n1 =Math.abs(n);
        long n2 =Math.abs(d);


        long result = 1;
        long min = Math.min(n1, n2);
        for (long i = 2; i <= min ; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public long getNumerator() {
        return this.r[0];
    }

    public long getDenominator() {
        return this.r[1];
    }

    public Rational add(Rational secondRational) {
        long up = (this.r[0] * secondRational.r[1]) + (secondRational.r[0] * this.r[1]);
        long down = this.r[1] * secondRational.r[1];

        return new Rational(up,down);
    }

    public Rational subtract(Rational secondRational) {
        long up = (this.r[0] * secondRational.r[1]) - (secondRational.r[0] * this.r[1]);
        long down = this.r[1] * secondRational.r[1];

        return new Rational(up,down);
    }

    public Rational multiply(Rational secondRational) {
        long up = this.r[0] * secondRational.r[0];
        long down = this.r[1] * secondRational.r[1];

        return new Rational(up,down);
    }

    public Rational divide(Rational secondRational) {
        long up = this.r[0] * secondRational.r[1];
        long down = this.r[1] * secondRational.r[0];

        return new Rational(up,down);
    }

    @Override
    public String toString() {
        if (this.r[1] == 1) {
            return r[0] + "";
        } else {
            return r[0] + "/" + r[1];
        }
    }

    @Override
    public boolean equals(Object o) {
        return (this.subtract((Rational) (o))).getNumerator() == 0;
    }

    @Override
    public int intValue() {
        return (int) this.doubleValue();
    }

    @Override
    public long longValue() {
        return (long) this.doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }


    @Override
    public int compareTo(Object o) {
        if (this.subtract((Rational) o).getNumerator() == 0) {
            return 0;
        } else if (this.subtract((Rational) o).getNumerator() > 0) {
            return 1;
        }
        return -1;
    }
}
