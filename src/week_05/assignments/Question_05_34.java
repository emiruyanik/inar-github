package week_05.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerWins = 0;
        int userWins = 0;

        while (!(computerWins - userWins == 3 || userWins - computerWins == 3)) {

            int randomNumber = (int) (Math.random() * 3);
            int userNumber;

            do {
                System.out.println("Scissor (0),Rock (1),Paper (2)");
                userNumber = input.nextInt();
            } while (!(userNumber <= 2 && userNumber >= 0));

            if (randomNumber == 0 && userNumber == 2) {
                System.out.println("Computer is scissor. You are paper.Computer won ");
                computerWins++;
            } else if ((randomNumber == 1 && userNumber == 0)) {
                System.out.println("Computer is rock. You are scissor.Computer won ");
                computerWins++;

            } else if ((randomNumber == 2 && userNumber == 1)) {
                System.out.println("Computer is paper. You are rock.Computer won ");
                computerWins++;
            } else if (randomNumber == 2 && userNumber == 0) {
                System.out.println("You are scissor.Computer is paper.You won ");
                userWins++;
            } else if (randomNumber == 0 && userNumber == 1) {
                System.out.println("You are rock.Computer is scissor.You won ");
                userWins++;
            } else if (randomNumber == 1 && userNumber == 2) {
                System.out.println("You are paper.Computer is rock.You won ");
                userWins++;
            } else if (randomNumber == 0 && userNumber == 0) {
                System.out.println("You are scissor.Computer is scissor.It is draw ");

            } else if (randomNumber == 1 && userNumber == 1) {
                System.out.println("You are rock.Computer is rock.It is draw ");
            } else {
                System.out.println("You are paper.Computer is paper.It is draw ");
            }

            System.out.println("Computer wins:" + computerWins);
            System.out.println("User wins:" + userWins);

        }
    }
}