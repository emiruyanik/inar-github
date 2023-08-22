package week_03.assignments;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int flip = (int)(Math.random()*2);
        System.out.println("Guess the flip of coin(0 represents head and 1 represents tail");

        int guess = input.nextInt();
        System.out.println(guess);

        System.out.println((guess==flip)?" Your guess correct":" Your guess incorrect");
    }
}
