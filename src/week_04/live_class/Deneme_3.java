package week_04.live_class;

import java.util.Scanner;

public class Deneme_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance to your house ");
        int distance1 = Math.abs(input.nextInt());
        int distance2 = Math.abs(input.nextInt());
        int distance3 = Math.abs(input.nextInt());

        if (distance1<Math.min(distance2, distance3)){
            System.out.println("The nearest GYM to your house is GYM1 "+distance1);
        } else if (distance2<Math.min(distance1, distance3)) {
            System.out.println("The nearest GYM to your house is GYM2 "+distance2);

        }else {
            System.out.println("The nearest GYM to your house is GYM3 "+distance3);
        }

    }
}
