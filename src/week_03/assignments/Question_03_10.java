package week_03.assignments;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random()*100);
        int number2 = (int) (Math.random()*100);

        System.out.println("What is result of "+number1 +"+"+ number2);
        int answer = input.nextInt();

        System.out.println(answer);
        System.out.println((number1+number2)==(answer) ? "you are correct " : "you are wrong");

    }

    }

