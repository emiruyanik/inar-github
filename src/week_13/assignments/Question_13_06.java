package week_13.assignments;

public class Question_13_06 {
    public static void main(String[] args) {
        GeometricObject circle1=new ComparableCircleClass();
        GeometricObject circle2=new ComparableCircleClass("red",true,10);

        System.out.println("circle1-->"+circle1);
        System.out.println("circle2-->"+circle2);
        if (circle1.compareTo(circle2)==1){
            System.out.println("Circle1 is bigger than circle2");
        }else if(circle1.compareTo(circle2)==0){
            System.out.println("Circle1 and circle2 are equal");
        }else {
            System.out.println("Circle2 is bigger than circle1");
        }
    }
}
