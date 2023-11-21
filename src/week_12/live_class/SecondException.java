package week_12.live_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isValidInput = false;
        do {
            try {
                System.out.println("Enter an integer");
                int number = input.nextInt();
                isValidInput=true;
            }catch (InputMismatchException ex){
                System.out.println(ex.getMessage());
                input.nextLine();
            }
        } while (!isValidInput);
        System.out.println("process continue");
    }
}
