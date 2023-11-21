package week_12.live_class;

import java.io.IOException;
import java.util.Scanner;

public class FirstException extends Throwable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            int result = divisor(number1 , number2);
            System.out.println("result-->"+result);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("process continue");

    }

    private static int divisor(int numb1,int numb2) throws IOException {
        if (numb2==0){
            throw new ArithmeticException("divisor can not be zero");
        }
        return numb1/numb2;
    }
}
