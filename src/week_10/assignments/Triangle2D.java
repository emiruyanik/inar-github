package week_10.assignments;

public class Triangle2D {
    private MyPoint point1;
    private MyPoint point2;
    private MyPoint point3;

    Triangle2D() {
        this.point1 = new MyPoint(0, 0);
        this.point2 = new MyPoint(1, 1);
        this.point3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint myPoint1, MyPoint myPoint2, MyPoint myPoint3) {
        this.point1 = new MyPoint(myPoint1.getX(), myPoint1.getY());
        this.point2 = new MyPoint(myPoint2.getX(), myPoint2.getY());
        this.point3 = new MyPoint(myPoint3.getX(), myPoint3.getY());
    }

    private double side1() {
        return distanceBetweenTwoPoints(point1, point2);
    }

    private double side2() {
        return distanceBetweenTwoPoints(point2, point3);
    }

    private double side3() {
        return distanceBetweenTwoPoints(point1, point3);
    }


    private double distanceBetweenTwoPoints(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public MyPoint getPoint1() {
        return point1;
    }

    public void setPoint1(MyPoint point1) {
        this.point1 = point1;
    }

    public MyPoint getPoint2() {
        return point2;
    }

    public void setPoint2(MyPoint point2) {
        this.point2 = point2;
    }

    public MyPoint getPoint3() {
        return point3;
    }

    public void setPoint3(MyPoint point3) {
        this.point3 = point3;
    }

    public double getPerimeter() {
        return this.side1() + this.side2() + this.side3();
    }

    public double getArea() {
        double s = (side1() + side2() + side3()) / 2;
        return Math.sqrt((s) * (s - side1()) * (s - side2()) * (s - side3()));
    }

    public boolean contains(double x1, double y1) {
        double distance1 = distanceBetweenTwoPoints(getPoint1(), new MyPoint(x1, y1));
        double distance2 = distanceBetweenTwoPoints(getPoint2(), new MyPoint(x1, y1));
        double distance3 = distanceBetweenTwoPoints(getPoint3(), new MyPoint(x1, y1));

        return distance1 + distance2 + distance3 == getPerimeter();
    }

    public boolean contains(Triangle2D triangle2D) {
        if (getArea() > triangle2D.getArea() && point1.getX() == triangle2D.point1.getX() && point2.getY() ==
                triangle2D.point2.getY() && point3.getY() == triangle2D.point3.getY()) {
            return true;
        }
        return false;
    }

}
