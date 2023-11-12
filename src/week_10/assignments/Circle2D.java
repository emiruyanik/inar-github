package week_10.assignments;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean contains(double x1, double y1) {
        double distance = findTheDistanceBetweenTwoPoints(x1, y1);
        return !(distance > getRadius() / 2);
    }

    public boolean contains(Circle2D circle) {
        double distance = findTheDistanceBetweenTwoPoints(circle.getX(), circle.getY());
        return distance < circle.getRadius() + this.getRadius();
    }

    public boolean overlaps(Circle2D circle) {
        double distance = findTheDistanceBetweenTwoPoints(circle.getX(), circle.getY());
        return distance > Math.abs(this.getRadius() - circle.getRadius()) && distance < this.getRadius() + circle.getRadius();
    }

    private double findTheDistanceBetweenTwoPoints(double x1, double y1) {
        return Math.sqrt(Math.pow(this.getX() - x1, 2) + Math.pow(this.getY() - y1, 2));
    }
}
