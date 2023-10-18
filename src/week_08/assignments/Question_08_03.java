package week_08.assignments;

import static week_07.assignments.Question_07_02.print;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[]correctAnswers=new int[8];

        for (int i = 0; i < answers.length ; i++) {
            int correctCounter=0;
            for (int j = 0; j <answers[0].length ; j++) {
                if (answers[i][j]==keys[j]){
                    correctCounter++;
                }
            }
            correctAnswers[i]=correctCounter;

        }
        printStudentsCorrectAnswersWithIncreasingOrder(correctAnswers);


    }

   public static void printStudentsCorrectAnswersWithIncreasingOrder(int[] correctAnswers) {
      sortedCorrectAnswers(correctAnswers);
       for (int i = 0; i < correctAnswers.length ; i++) {
           System.out.println((i+1)+"."+"student correct count is "+correctAnswers[i]);
       }
    }

    public static void sortedCorrectAnswers(int[] correctAnswers) {
        for (int i = 0; i < correctAnswers.length-1 ; i++) {
            int min=correctAnswers[i];
            int indexOfMin=i;
            for (int j = i+1; j < correctAnswers.length ; j++) {
                if (min>correctAnswers[j]){
                    min=correctAnswers[j];
                    indexOfMin=j;
                }

            }
            if (indexOfMin!=i){
                correctAnswers[indexOfMin]=correctAnswers[i];
                correctAnswers[i]=min;
            }
        }
    }
}
