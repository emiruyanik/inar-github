package week_08.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number:");
        int employeeNumb = input.nextInt();
        int[][] workersWorkingHours = getMatrix(employeeNumb);
        int[] totalWorkingHours = totalWorkingHours(workersWorkingHours);
        Arrays.sort(totalWorkingHours);
        for (int i = totalWorkingHours.length; i > 0; i--) {
            System.out.println("Employee " + (i + 1) + "'s working hour is " + totalWorkingHours[i - 1]);

        }
    }

    public static int[] totalWorkingHours(int[][] workersWorkingHours) {
        int[] list = new int[workersWorkingHours.length];
        for (int i = 0; i < workersWorkingHours.length; i++) {
            int total = 0;
            for (int j = 0; j < workersWorkingHours[0].length; j++) {
                total += workersWorkingHours[i][j];
            }
            list[i] = total;
        }
        return list;
    }

    public static int[][] getMatrix(int employeeNumb) {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[employeeNumb][7];

        System.out.println("Enter the working hours of employees:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = input.nextInt();
            }

        }
        return result;
    }
}
