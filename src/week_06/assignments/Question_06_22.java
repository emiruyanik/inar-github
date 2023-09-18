package week_06.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        long number = input.nextLong();

        System.out.println("The approximated square root of "+number+" is "+sqrt(number));

    }
    public static double sqrt(long number){
        double init=0;
        double nextGuess;
        double lastGuess;
        do {
            init++;
            lastGuess =init;
            nextGuess =((lastGuess+(number/lastGuess))/2) ;

        }while (nextGuess-lastGuess>0.001);

        return init;

    }
}
