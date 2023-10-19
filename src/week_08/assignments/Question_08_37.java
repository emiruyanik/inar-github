package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        String[][] capitalsOfStates = createTheArray();
        for (String[] capitalsOfState : capitalsOfStates) {
            System.out.print("What is the capital of " + capitalsOfState[0] + "?");
            String str = input.nextLine();
            if (str.equalsIgnoreCase(capitalsOfState[1])) {
                correctCount++;
            }
        }
        System.out.println("The correct count is " + correctCount);
    }

    public static String[][] createTheArray() {
        String[][] result = new String[10][2];
        result[0][0] = "Alabama";
        result[1][0] = "Alaska";
        result[2][0] = "Arkansas";
        result[3][0] = "Arizona";
        result[4][0] = "California";
        result[5][0] = "Colorado";
        result[6][0] = "Delaware";
        result[7][0] = "Florida";
        result[8][0] = "Georgia";
        result[9][0] = "Indiana";

        result[0][1] = "Montgomery";
        result[1][1] = "Juneau";
        result[2][1] = "Little Rock";
        result[3][1] = "Phoenix";
        result[4][1] = "Sacramento";
        result[5][1] = "Denver";
        result[6][1] = "Dover";
        result[7][1] = "Tallahassee";
        result[8][1] = "Atlanta";
        result[9][1] = "Indianapolis";

        return result;
    }

}
