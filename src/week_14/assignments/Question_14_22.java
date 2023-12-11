package week_14.assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_14_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer:");

        int originalNumber = input.nextInt();
        int duplicatedNumber = originalNumber;

        int result = 0;
        while (result != 1) {
            List<Integer> integerList = new ArrayList<>();
            while (duplicatedNumber != 0) {
                integerList.add(duplicatedNumber % 10);
                duplicatedNumber /= 10;
            }
            result = 0;
            for (int i = 0; i < integerList.size(); i++) {
                result += (int) Math.pow(integerList.get(i), 2);
            }
            integerList.clear();
            duplicatedNumber = result;

        }
        System.out.println(originalNumber + " is happy number");
    }
}
