package week_13.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Circle("red",false,5);
        geometricObjects[1] = new Rectangle(3, 5);
        geometricObjects[2] = new Triangle("green",false,7, 24, 25);
        geometricObjects[3] = new Triangle("blue",true,3, 4, 5);
        geometricObjects[4] = new Circle("blue",true,4.5);
        Arrays.sort(geometricObjects);
        System.out.println(Arrays.toString(geometricObjects));

        System.out.println("Total area-->"+totalArea(geometricObjects));
    }
    public static double totalArea(GeometricObject[]geometricObjects){
        double result=0;
        int i=1;
        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println((i++)+" --> "+geometricObject.getArea());
            result += geometricObject.getArea();
        }
        return result;
    }
}
