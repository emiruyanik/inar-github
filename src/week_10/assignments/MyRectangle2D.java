package week_10.assignments;

public class MyRectangle2D {
    private double width;
    private double height;
    private double x;
    private double y;

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return (x >= width / 2 - getX() && x <= width / 2 + getX()) && (y >= height / 2 - getY() && y <= height / 2 + getY());
    }

    public boolean contains(MyRectangle2D myRectangle2D) {
        return (myRectangle2D.getX() >= width / 2 - getX() && myRectangle2D.getX() <= width / 2 + getX()) &&
                (myRectangle2D.getY() >= height / 2 - getY() && myRectangle2D.getY() <= height / 2 + getY());
    }

    public boolean overlaps(MyRectangle2D myRectangle2D) {
        return ((myRectangle2D.getX() - myRectangle2D.width / 2 >= getX() - width / 2 && myRectangle2D.getX() + myRectangle2D.width / 2 <=
                getX() + width / 2) && (myRectangle2D.getY() - myRectangle2D.height / 2 >= getY() - height / 2 && myRectangle2D.getY() +
                myRectangle2D.getHeight() / 2 <= getY() + height / 2));
    }
}


