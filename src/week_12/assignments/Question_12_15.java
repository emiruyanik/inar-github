package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\src\\" +
                "week_12\\assignments\\sortedString.txt");

        ArrayList<Integer> integerArrayListOfOutput = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Integer randomNumber = (int) (Math.random() * 100);
            integerArrayListOfOutput.add(randomNumber);
        }

        PrintWriter printWriter = new PrintWriter(file);
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : integerArrayListOfOutput) {
            stringBuilder.append(integer).append(" ");
        }
        printWriter.println(stringBuilder.toString());
        printWriter.close();

        Scanner input = new Scanner(file);
        String numbers = "";


        while (input.hasNext()) {
            numbers += input.nextLine() + "\n";

        }
        String[] arrayOfNumbers = numbers.split("[\\n\\s]+");
        ArrayList<Integer> integerArrayListOfInput = new ArrayList<>();
        for (String arrayOfNumber : arrayOfNumbers) {
            integerArrayListOfInput.add(Integer.parseInt(arrayOfNumber));
        }
        java.util.Collections.sort(integerArrayListOfInput);
        int counter = 0;
        for (Integer integer : integerArrayListOfInput) {
            System.out.print(integer + " ");
            counter++;

            if (counter % 10 == 0) {
                System.out.println();
            }
        }


    }
}
