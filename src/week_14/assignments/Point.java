package week_14.assignments;

public class Point implements Comparable<Point> {
    private double x;
    private double y;
    public Point(){
        this(0,0);
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.getX() > o.getX()) {
            return 1;
        } else if (this.getX() == o.getX()) {
            return 0;
        }
        return -1;
    }
}
