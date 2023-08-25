package week_04.live_class;

import java.util.Scanner;

public class Deneme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));
        System.out.println(Math.round(area));

    }
}
