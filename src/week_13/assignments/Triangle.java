package week_13.assignments;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1=1;
        this.side2=1;
        this.side3=1;
    }

    public Triangle(String colour,boolean isFilled,double side1, double side2, double side3) {
        super(colour,isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double getArea() {
        double s = (this.getPerimeter()) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return super.toString()+"Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "perimeter --> "+this.getPerimeter()+"area -->"+this.getArea()+
                '}';
    }
}
