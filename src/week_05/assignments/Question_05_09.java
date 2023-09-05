package week_05.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();

        int[] notes = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];

        int max = 0;
        int secondBigNumber = 0;

        String studentWithTheHighestScore = "";
        String studentWithTheHighestSecondScore = "";

        boolean checking1 = true;
        boolean checking2 = true;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter each student's score and name");
            notes[i] = input.nextInt();
            input.nextLine();
            names[i] = input.nextLine();
            System.out.printf("Student: %d\n", i + 1);
            System.out.printf("%11s: %d\n", "Score", notes[i]);
            System.out.printf("%10s: %s\n", "Name", names[i]);
        }

        for (int i = 0; i < numberOfStudents; i++) {
            if (checking1) {
                max = notes[i];
                studentWithTheHighestScore = names[i];
            }
            for (int j = 1; j < numberOfStudents - i; j++) {
                if (max < notes[i+1]) {
                    checking1 = true;
                    break;
                } else {
                    checking1 = false;
                }
            }


        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (notes[i] != max && checking2) {
                secondBigNumber = notes[i];
                studentWithTheHighestSecondScore = names[i];

            }
            for (int j = 1; j < numberOfStudents - i; j++) {
                if (secondBigNumber < notes[i+1]) {
                    checking2 = true;
                    break;
                } else {
                    checking2 = false;
                }
            }
        }


        System.out.println("Student with the highest score is : "+studentWithTheHighestScore);
        System.out.println("Student with the highest second score is : "+studentWithTheHighestSecondScore);

    }
}