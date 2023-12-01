package week_13.assignments;

public class Question_13_05 {
    public static void main(String[] args) {
        GeometricObject circle1=new Circle("red",true,10);
        GeometricObject circle2=new Circle("black",true,5);



        GeometricObject rectangle1=new Rectangle("white",false,5.5,6);
        GeometricObject rectangle2=new Rectangle("blue",true,2,1);

       GeometricObject testRectangles= GeometricObject.max(rectangle1,rectangle2);
       GeometricObject testCircles=GeometricObject.max(circle1,circle2);

        System.out.println("The larger of the circle is:");
        System.out.println(testCircles);

        System.out.println("The larger of the rectangle is:");
        System.out.println(testRectangles);
    }
}
