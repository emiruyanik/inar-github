package week_14.assignments;

import java.util.Scanner;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = input.nextLine();
        int index = -1;
        char ch = ' ';
        boolean unrepeated = true;


        for (int i = 0; i < str.length(); i++) {
            char control = str.charAt(i);
            unrepeated=true;
            for (int j = i + 1; j < str.length(); j++) {
                if (control == str.charAt(j)) {
                    unrepeated=false;
                    break;
                }
            }
            if (unrepeated){
                ch=control;
                break;
            }
        }


        index = str.indexOf(ch)+1;
        System.out.println("The first unrepeated character is " + ch + " " + index + ". character of the string");
    }
}
