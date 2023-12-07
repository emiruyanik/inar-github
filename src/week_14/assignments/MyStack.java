package week_14.assignments;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> numbers;
    Queue<Integer> temQueue;

    public MyStack() {
        numbers = new LinkedList<>();
        temQueue = new LinkedList<>();
    }

    public void push(Integer number) {
        this.numbers.add(number);
    }

    public Integer pop() {
        while (numbers.size() != 1) {
            temQueue.add(numbers.remove());
        }
        numbers.addAll(temQueue);
        temQueue.clear();
        return numbers.remove();
    }

    public Integer top() {
        while (numbers.size()!=1) {
            temQueue.add(numbers.remove());
        }
        numbers.addAll(temQueue);
        temQueue.clear();
        return numbers.peek();
    }
    public boolean isEmpty(){
        return numbers.isEmpty();
    }
    public int size(){
        return numbers.size();
    }
}
