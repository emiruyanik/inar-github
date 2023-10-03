package week_07.assignments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        System.out.print("Enter " + numberOfStudents + " scores:");
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }


        printScores(scores);
    }

    public static void printScores(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + printGrade(scores[i], scores));
        }
    }

    private static Character printGrade(int score, int[] scores) {
        int max = maxScore(scores);
        if (score >= max - 10) {
            return 'A';
        } else if (score >= max - 20) {
            return 'B';
        } else if (score >= max - 30) {
            return 'C';
        } else if (score >= max - 40) {
            return 'D';
        }

        return 'F';
    }

    public static int maxScore(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
}
