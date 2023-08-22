package week_03.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 3);

        System.out.println("Enter a value for scissor (0),rock(1),paper(2) ");
        int userNumber = input.nextInt();

        if (0 <= userNumber && userNumber <= 2) {
            if (randomNumber == 0 && userNumber == 0) {
                System.out.println("The computer scissor.You are scissor.It is Draw ");
            } else if (randomNumber == 0 && userNumber == 1) {
                System.out.println("The computer scissor.You are rock.You win ");

            } else if (randomNumber == 0 && userNumber == 2) {
                System.out.println("The computer scissor.You are paper.You lose ");
            } else if (randomNumber == 1 && userNumber == 0) {
                System.out.println("The computer rock.You are scissor.You lose ");
            } else if (randomNumber == 1 && userNumber == 1) {
                System.out.println("The computer rock.You are rock.It is Draw");

            } else if (randomNumber == 1 && userNumber == 2) {
                System.out.println("The computer rock.You are paper.You win ");
            } else if (randomNumber == 2 && userNumber == 0) {
                System.out.println("The computer paper.You are scissor.You win ");

            } else if (randomNumber == 2 && userNumber == 1) {
                System.out.println("The computer paper.You are rock.You lose ");

            } else if (randomNumber == 2 && userNumber == 2) {
                System.out.println("The computer is paper.You are paper.It is Draw ");


            }
        } else {
            System.out.println("Invalid value");
        }
    }
}
