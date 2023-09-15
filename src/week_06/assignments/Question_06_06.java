package week_06.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);
    }
    public static void displayPattern(int numberOfRows){
        for (int i = 1; i <=numberOfRows ; i++) {

            for (int j = numberOfRows-i; j >0 ; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
