package week_09.live_class;

public class CircleWithStaticMembers {
    double radius;

    static int numberOfObjects=0;

    CircleWithStaticMembers(){
        radius=1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(int newRadius){
        radius=newRadius;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
