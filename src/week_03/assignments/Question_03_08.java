package week_03.assignments;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        if (number1 > number2 && number1 > number3) {
            firstNumber = number1;
            if (number2 > number3) {
                secondNumber = number2;
                thirdNumber = number3;
            } else {
                secondNumber = number3;
                thirdNumber = number2;
            }
        }
        if (number2 > number1 && number2 > number3) {
            firstNumber = number2;
            if (number1 > number3) {
                secondNumber = number1;
                thirdNumber = number3;
            } else {
                secondNumber = number3;
                thirdNumber = number1;
            }


        }
        if (number3 > number2 && number3 > number2) {
            firstNumber = number3;
            if (number2 > number1) {
                secondNumber = number2;
                thirdNumber = number1;
            } else {
                secondNumber = number1;
                thirdNumber = number2;
            }
        }
        if (number1==number2 && number1>number3){
            firstNumber=number1;
            secondNumber=number2;
            thirdNumber=number3;
        }
        if (number3==number2 && number3>number1){
            firstNumber=number3;
            secondNumber=number2;
            thirdNumber=number1;
        }
        if (number1==number3 && number1>number2){
            firstNumber=number1;
            secondNumber=number3;
            thirdNumber=number2;
        }
        if (number1==number2 && number1==number3){
            firstNumber=number1;
            secondNumber=number2;
            thirdNumber=number3;
        }

            System.out.println("non decreasing order is " + thirdNumber + " " + secondNumber + " " + firstNumber);
        }
    }
