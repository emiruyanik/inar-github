package week_04.assignments;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = input.next().charAt(0);

        int number = (int) ch;
        System.out.println("The unicode for the character "+ch+" is "+number);


    }
}
