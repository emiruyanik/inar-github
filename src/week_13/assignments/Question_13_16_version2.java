package week_13.assignments;

import java.util.Scanner;

public class Question_13_16_version2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter,first rational:");

        String firstRational = input.nextLine();

        String[] numbers1 = firstRational.split("/");
        long numb1 = Long.parseLong(numbers1[0]);
        long numb2 = Long.parseLong(numbers1[1]);

        System.out.println("Enter,second rational:");
        String secondRational = input.nextLine();

        String[] numbers2 = secondRational.split("/");
        long numb3 = Long.parseLong(numbers2[0]);
        long numb4 = Long.parseLong(numbers2[1]);

        System.out.print("Enter the operator:");
        String operator = input.nextLine();
        char actualOperator = operator.charAt(0);
        switch (actualOperator) {
            case '+':
                MainRational mainRational1 = new MainRational(numb1, numb2);
                MainRational mainRational2 = new MainRational(numb3, numb4);
                MainRational result1 = mainRational1.add(mainRational2);
                System.out.println("result-->" + result1);
                break;
            case '-':
                MainRational mainRational3 = new MainRational(numb1, numb2);
                MainRational mainRational4 = new MainRational(numb3, numb4);
                MainRational result2 = mainRational3.subtract(mainRational4);
                System.out.println("result-->" + result2);
                break;
            case '*':
                MainRational mainRational5 = new MainRational(numb1, numb2);
                MainRational mainRational6 = new MainRational(numb3, numb4);
                MainRational result3 = mainRational5.multiply(mainRational6);
                System.out.println("result-->" + result3);
                break;
            case '/':
                MainRational mainRational7 = new MainRational(numb1, numb2);
                MainRational mainRational8 = new MainRational(numb3, numb4);
                MainRational result4 = mainRational7.multiply(mainRational8);
                System.out.println("result-->" + result4);
                break;
        }
    }
}
