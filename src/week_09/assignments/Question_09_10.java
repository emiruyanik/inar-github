package week_09.assignments;

public class Question_09_10 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 3, 1);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("The equation has two roots");
            System.out.print(quadraticEquation.getRoot1());
            System.out.print(" and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("The equation has one root");
            System.out.print(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
        System.out.println();


        QuadraticEquation quadraticEquation1 = new QuadraticEquation(1, 2, 1);
        if (quadraticEquation1.getDiscriminant() > 0) {
            System.out.print("The equation has two roots");
            System.out.print(quadraticEquation1.getRoot1());
            System.out.print(" and " + quadraticEquation1.getRoot2());
        } else if (quadraticEquation1.getDiscriminant() == 0) {
            System.out.print("The equation has one root");
            System.out.print(quadraticEquation1.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
        System.out.println();

        QuadraticEquation quadraticEquation2 = new QuadraticEquation(1, 2, 3);
        if (quadraticEquation2.getDiscriminant() > 0) {
            System.out.print("The equation has two roots");
            System.out.print(quadraticEquation2.getRoot1());
            System.out.print(" and " + quadraticEquation2.getRoot2());
        } else if (quadraticEquation2.getDiscriminant() == 0) {
            System.out.print("The equation has one root");
            System.out.print(quadraticEquation2.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }


}
