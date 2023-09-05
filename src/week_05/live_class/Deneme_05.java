package week_05.live_class;

import java.util.Scanner;

public class Deneme_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();
        boolean check = true;

        for (int i=0;i<word.length()/2;i++){
            if (word.charAt(i)==word.charAt(word.length()-(i+1))){
                check = true;
            }else {
                check = false;
            }
        }
        System.out.println((check)?"The word is palindrome":"The word is not palindrome");

    }
}
