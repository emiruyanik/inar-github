package week_11.assignments;

import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();

        System.out.print("Enter five strings:");

        for (int i = 0; i < 5; i++) {
            Object o = input.nextLine();
            myStack.push(o);
        }

        System.out.println(myStack);

        System.out.println("Displaying them in reverse order:");
        int size = myStack.getSize();

        for (int i = 0; i < size; i++) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
