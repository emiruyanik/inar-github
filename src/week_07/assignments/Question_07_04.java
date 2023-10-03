package week_07.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the scores (negative number signifies end):");
        ArrayList<Integer> scores = new ArrayList<>();
        int score;
        do {
            score = input.nextInt();

            if (score >= 0) {
                scores.add(score);
            }
        } while (score >= 0);
        double average = averageOfScores(scores);
        System.out.println("Average of scores " + average);

        int numbersOfScoreAboveOrEqualToAverage = numbersOfScoreAboveOrEqualToAverage(scores);
        System.out.println("Number of score above or equal to average " + numbersOfScoreAboveOrEqualToAverage);

        int numberOfScoresBelowAverage = numberOfScoresBelowAverage(scores);
        System.out.println("Number of score below the average " + numberOfScoresBelowAverage);
    }

    private static double averageOfScores(ArrayList<Integer> scores) {

        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }
        return total / scores.size();
    }


    public static int numberOfScoresBelowAverage(ArrayList<Integer> scores) {
        double average = averageOfScores(scores);
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < average) {
                count++;
            }
        }
        return count;
    }

    public static int numbersOfScoreAboveOrEqualToAverage(ArrayList<Integer> scores) {
        double avearge = averageOfScores(scores);
        int count = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= avearge) {
                count++;
            }
        }
        return count;
    }


}
