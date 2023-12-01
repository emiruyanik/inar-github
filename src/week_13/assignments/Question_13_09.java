package week_13.assignments;

public class Question_13_09 {
    public static void main(String[] args) {
        GeometricObject circle1=new Circle("black",true,15);
        GeometricObject circle2=new Circle("white",false,5);
        GeometricObject circle3=new Circle("yellow",false,5);

        System.out.println("Circle1 and Circle 2 are equals?"+circle1.equals(circle2));
        System.out.println("Circle2 and Circle 3 are equals?"+circle2.equals(circle3));

        System.out.println("Circle1 is bigger than circle2?"+circle1.compareTo(circle2));

    }
}
