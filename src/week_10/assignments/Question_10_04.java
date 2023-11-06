package week_10.assignments;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.printf("The distance between two points: %.2f", myPoint1.distance(myPoint2));

    }
}
