package week_13.assignments;

import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a decimal number:");
        String decimal=input.nextLine();
        String[] numbers = decimal.split(",");

        Rational rational1=new Rational(Long.parseLong(numbers[0]),1);
        for (int i = 0; i < numbers[1].length() ; i++) {
            Rational rationalFraction=new Rational(Long.parseLong(numbers[1].charAt(i)+""),(long) Math.pow(10,(i+1)));
            rational1=rational1.add(rationalFraction);
        }
        if (decimal.charAt(0)=='-'){
            System.out.println("The fraction number is-->"+"-"+rational1);
        }else {
            System.out.println("The fraction number is-->"+rational1);
        }

    }
}
