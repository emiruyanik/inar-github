package week_14.assignments;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Post Fix Expression:");

        String str = input.nextLine();
        String[] values = str.split(" ");

        List<Integer> numbers = new Stack<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i].length() > 1) {
                if (Character.isDigit(values[i].charAt(0)) || Character.isDigit(values[i].charAt(1))) {
                    numbers.add(Integer.parseInt(values[i]));
                } else {
                    char ch = values[i].charAt(0);
                    switch (ch) {
                        case '+':
                            int add = 0;
                            int loopNumber = numbers.size();
                            for (int j = 0; j < loopNumber; j++) {
                                add += numbers.remove(0);
                            }
                            numbers.add(0, add);
                            break;
                        case '-':
                            int subtract = numbers.remove(0);
                            int loop = numbers.size();
                            for (int j = 0; j < loop; j++) {
                                subtract -= numbers.remove(0);
                            }
                            numbers.add(0, subtract);
                            break;
                        case '*':
                            int multiply = 1;
                            int loopN = numbers.size();
                            for (int j = 0; j < loopN; j++) {
                                multiply *= numbers.remove(0);
                            }
                            numbers.add(0, multiply);
                            break;
                        case '/':
                            int divide = numbers.remove(0);
                            int loopNu = numbers.size();
                            for (int j = 0; j < loopNu; j++) {
                                divide /= numbers.remove(0);
                            }
                            numbers.add(0, divide);
                            break;
                    }
                }
            } else {
                if (Character.isDigit(values[i].charAt(0))) {
                    numbers.add(Integer.parseInt(values[i]));
                } else {
                    char ch = values[i].charAt(0);
                    switch (ch) {
                        case '+':
                            int add = 0;
                            int loopNumber = numbers.size();
                            for (int j = 0; j < loopNumber; j++) {
                                add += numbers.remove(0);
                            }
                            numbers.add(0, add);
                            break;
                        case '-':
                            int subtract = numbers.remove(0);
                            int loop = numbers.size();
                            for (int j = 0; j < loop; j++) {
                                subtract -= numbers.remove(0);
                            }
                            numbers.add(0, subtract);
                            break;
                        case '*':
                            int multiply = 1;
                            int loopN = numbers.size();
                            for (int j = 0; j < loopN; j++) {
                                multiply *= numbers.remove(0);
                            }
                            numbers.add(0, multiply);
                            break;
                        case '/':
                            int divide = numbers.remove(0);
                            int loopNu = numbers.size();
                            for (int j = 0; j < loopNu; j++) {
                                divide /= numbers.remove(0);
                            }
                            numbers.add(0, divide);
                            break;
                    }
                }
            }


        }
        System.out.println("Result-->" + numbers.get(0));

    }
}
