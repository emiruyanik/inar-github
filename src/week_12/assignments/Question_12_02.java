package week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        int result = 0;
        boolean check=true;
        do {
            try {
                System.out.print("Enter two integers:");
                int numb1 = input.nextInt();
                int numb2 = input.nextInt();
                result = sum(numb1, numb2);
                check=false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input please try again:");
                input.nextLine();
            }

        }while (check);

        System.out.println("Result is-->" + result);
    }
    public static int sum(int numb1,int numb2){
        return numb1+numb2;
    }

}
