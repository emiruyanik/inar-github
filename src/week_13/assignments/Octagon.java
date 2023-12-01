package week_13.assignments;

public class Octagon extends GeometricObject implements Cloneable{
    private double side;

    public Octagon() {
        super("white", false);
        this.side = 1;
    }

    public Octagon(String colour, boolean isFilled, double side) {
        super(colour, isFilled);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public double getArea() {
        return (2 + (4 / Math.sqrt(2)))*side*side;
    }
    @Override
    public Object clone()throws CloneNotSupportedException {
        return super.clone();
    }
}
