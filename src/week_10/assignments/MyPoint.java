package week_10.assignments;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint1) {
        return Math.sqrt(Math.pow(this.x - myPoint1.getX(), 2) + Math.pow(this.y - myPoint1.getY(), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    private double getX() {
        return x;
    }

    private double getY() {
        return y;
    }
}
