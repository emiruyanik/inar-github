package week_13.assignments;

public class  Circle extends GeometricObject {

    private double radius;

    public Circle(){
        this.radius=0;
    }
    public Circle(String colour,Boolean isFilled,double radius){
        super(colour,isFilled);
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+"Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public boolean equals(Object o){
        return this.radius == ((Circle) o).radius;
    }
}
