package week_14.assignments;


public class Question_14_08 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        System.out.println(myStack.top());
        System.out.println(myStack.size());

        System.out.println(myStack.pop());
        System.out.println(myStack.size());

        System.out.println(myStack.top());
        System.out.println(myStack.size());

        myStack.push(15);
        System.out.println(myStack.top());
        System.out.println(myStack.size());
    }
}