package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\yusuf\\workplace\\inar-java\\" +
                "src\\week_12\\assignments\\numbers.txt");

        Scanner input = new Scanner(file);
        String list = "";

        while (input.hasNext()) {
            list += (input.nextLine() + "\n");
        }
        String[] withoutSpacesList = list.split("[\\n\\s]+");
        int total = 0;
        int count = 0;
        try {

            for (int i = 0; i < withoutSpacesList.length; i++) {
                boolean check = true;
                String number = withoutSpacesList[i];
                for (int j = 0; j < number.length(); j++) {
                    if (!Character.isDigit(number.charAt(j))) {
                        check = false;
                        break;
                    }


                }
                if (check) {
                    total += Integer.parseInt(number);
                    count++;
                }


            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Sum of the numbers in the file-->" + total);
        System.out.println("Number of the integers in the file-->" + count);
        try {
            double average = total / count;
            System.out.println("Average-->" + average);
        } catch (ArithmeticException ex1) {
            System.out.println("Arithmetic exception");
        }


    }
}
