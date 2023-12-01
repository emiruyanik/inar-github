package week_13.assignments;

import java.util.Date;

public class Rectangle extends GeometricObject {

    private double side1;
    private double side2;


    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(String colour, boolean isFilled, double side1, double side2) {
        super(colour, isFilled);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override

    public double getPerimeter() {
        return 2 * (this.side1 + this.side2);
    }

    @Override
    public double getArea() {
        return this.side1 * this.side2;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return this.getArea() ==((Rectangle)o).getArea();
    }
}
