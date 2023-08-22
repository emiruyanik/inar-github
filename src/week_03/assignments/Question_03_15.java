package week_03.assignments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottterynumber = (int) ((Math.random()*900)+100);




        System.out.println("Enter your lottery pick (three digit)");
        int guess = input.nextInt();
        System.out.println("The lottery number is "+lottterynumber);

        int number1 = lottterynumber%10;
        int number2 = (lottterynumber/10)%10;
        int number3 =lottterynumber/100;

        int guessNumber1 = guess%10;
        int guessNumber2 = (guess/10)%10;
        int guessNumber3 = guess/100;




        if (guess==lottterynumber){
            System.out.println("You win $10000 !");
        } else if ((number1==guessNumber1 && number2==guessNumber3 && number3==guessNumber2)||(number3==guessNumber1 && number2==guessNumber2 && number1==guessNumber3)||(number3==guessNumber1 && number2==guessNumber3 && number1==guessNumber3)||(number2==guessNumber1 && number1==guessNumber2 && number3==guessNumber3)||(number2==guessNumber1 && number1==guessNumber3 && number3==guessNumber2)) {
            System.out.println("You win $3000");

        } else if (number1==guessNumber1||number1==guessNumber2||number1==guessNumber3||number2==guessNumber1||number2==guessNumber2||number2==guessNumber3||number3==guessNumber1||number3==guessNumber2||number3==guessNumber3) {
            System.out.println("You win $1000");

        }
        else {
            System.out.println("You win nothing");
        }

    }
}
