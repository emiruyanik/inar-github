package week_13.assignments;

import java.math.BigInteger;

public class Question_13_08 {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(38);
        myStack.push(45.58974);
        myStack.push(new BigInteger("1241523278521354112"));
        MyStack myStack1=myStack.clone();
        myStack1.push(878456665);
        myStack1.push(85.454);
        System.out.println(myStack);
        System.out.println(myStack1);
    }
}
