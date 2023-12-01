package week_13.assignments;

public class Square extends GeometricObject implements Question_13_07.Colourable {
    private double side;

    public Square() {
        super("white", false);
        this.side = 1;
    }


    public Square(String colour, boolean isFilled, double side) {
        super(colour, isFilled);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void howToColour() {
        System.out.println("Colour all four sides");
    }
}
