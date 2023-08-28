package week_04.assignments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String s1 = input.nextLine();

        int s1Length = s1.length();
        char s1FirstCh = s1.charAt(0);

        System.out.printf("Length of the string %d\n",s1Length);
        System.out.printf("First character of the string %c",s1FirstCh);



    }
}
