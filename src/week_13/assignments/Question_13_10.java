package week_13.assignments;

public class Question_13_10 {
    public static void main(String[] args) {
        GeometricObject rectangle1 = new Rectangle("blue", false, 4, 5);
        GeometricObject rectangle2 = new Rectangle("red", true, 4, 5);
        GeometricObject rectangle3 = new Rectangle();

        System.out.println("rectangle1 and rectangle2  are equals ?"+rectangle1.equals(rectangle2));
        System.out.println("rectangle1 and rectangle3 are equals ?"+rectangle1.equals(rectangle3));

        System.out.println("rectangle1 is bigger than rectangle3 ?"+rectangle1.compareTo(rectangle3));

    }
}
