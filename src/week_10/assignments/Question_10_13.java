package week_10.assignments;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D myRectangle2D=new MyRectangle2D(2,2,5.5,4.9);
        System.out.println(myRectangle2D.getPerimeter());
        System.out.println(myRectangle2D.getArea());
        System.out.println(myRectangle2D.contains(3, 3));
        System.out.println(myRectangle2D.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(myRectangle2D.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
