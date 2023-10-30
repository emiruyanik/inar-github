package week_09.assignments;

public class Question_09_01 {
    public static void main(String[] args) {
                Rectangle rectangle1=new Rectangle(4,40);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        Rectangle rectangle2=new Rectangle(3.5,35.9);

        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        System.out.println(rectangle1.height);

        rectangle1.height = 35;
        System.out.println(rectangle1.height);
        rectangle1.width = 2;

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
