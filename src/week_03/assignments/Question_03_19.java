package week_03.assignments;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the perimeter");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        int perimeter = 0;

        if (side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side2 + side1)) {
            perimeter = side1 + side2 + side3;
            System.out.println("The perimeter is "+perimeter);
        } else {
            System.out.println("The input is invalid");
        }

    }
}
