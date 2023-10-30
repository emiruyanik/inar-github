package week_09.live_class;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(CircleWithStaticMembers.getNumberOfObjects());

        CircleWithStaticMembers circle1=new CircleWithStaticMembers();

        circle1.numberOfObjects=100;

        System.out.println(circle1.numberOfObjects);

        System.out.println(circle1.getNumberOfObjects());

        System.out.println(CircleWithStaticMembers.getNumberOfObjects());

        CircleWithStaticMembers circle2=new CircleWithStaticMembers(25);

        System.out.println(circle1.radius);

        System.out.println(CircleWithStaticMembers.getNumberOfObjects());


    }
}
