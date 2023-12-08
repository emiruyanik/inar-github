package week_14.assignments;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Question_14_09 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        myQueue.push(40);
        myQueue.push(50);
        System.out.println(myQueue.peek());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        myQueue.push(70);
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
        myQueue.push(45);
        System.out.println(myQueue.pop());
        System.out.println("size-->" + myQueue.size());
    }
}
