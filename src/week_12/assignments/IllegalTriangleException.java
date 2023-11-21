package week_12.assignments;

public class IllegalTriangleException extends IllegalArgumentException {
    public IllegalTriangleException() {
        super("The sum of any two sides must be greater than remaining side");
    }

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("The sum of any two sides must be greater than remaining side"
                + side1 + " " + side2 + " " + side3);
    }
}
