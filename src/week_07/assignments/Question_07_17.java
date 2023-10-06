package week_07.assignments;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];
        input.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student" + (i + 1) + ":");
            names[i] = input.nextLine();


            System.out.print("Score" + ":");
            scores[i] = input.nextInt();
            input.nextLine();

        }
        int[] rankOfScores = rankOfScores(scores);
        printNames(rankOfScores, names);

    }

    public static void printNames(int[] rankOfScores, String[] names) {
        for (int i = 0; i < rankOfScores.length; i++) {
            System.out.println(names[rankOfScores[i]]);

        }
    }

    public static int[] rankOfScores(int[] scores) {
        int[] result = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            result[i] = i;
        }
        for (int i = 0; i < scores.length - 1; i++) {
            int max = scores[i];
            int currentIndex = i;
            int currentResult = result[i];
            int futureIndex = 0;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > max) {
                    max = scores[j];
                    currentIndex = j;
                    futureIndex = j;
                }
            }
            if (currentIndex != i) {
                scores[currentIndex] = scores[i];
                scores[i] = max;
                result[i] = result[futureIndex];
                result[futureIndex] = currentResult;
            }
        }


        return result;
    }
}


