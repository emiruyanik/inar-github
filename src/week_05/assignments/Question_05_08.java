package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();
        int[] notes = new int[numberOfStudents];
        boolean checking = true;
        int max = 0;
        String[] names = new String[numberOfStudents];
        String studentWithTheHighestScore = "";

        System.out.println("Enter each student's score and name");

        for (int i = 0; i < numberOfStudents; i++) {
            notes[i] = input.nextInt();
            input.nextLine();
            names[i] = input.nextLine();
            System.out.printf("Student %d\n", (i + 1));
            System.out.printf("%10s: %s\n", "Name", names[i]);
            System.out.printf("%11s: %d\n", "Score", notes[i]);


        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (checking) {
                max = notes[i];
                studentWithTheHighestScore = names[i];

            }
            for (int j = 1; j < numberOfStudents - i; j++) {
                if (max < notes[i + 1]) {
                    checking = true;
                    continue;
                } else {
                    checking = false;
                }
            }
        }
        System.out.println("Student with the highest score is : " + studentWithTheHighestScore);
    }
}