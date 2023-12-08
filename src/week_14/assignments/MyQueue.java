package week_14.assignments;

import java.util.List;
import java.util.Stack;

public class MyQueue {
    private List<Integer> list;
    private List<Integer> tempList;
    private boolean isArranged;

    public MyQueue() {
        this.list = new Stack<>();
        this.tempList = new Stack<>();
    }

    public void push(Integer number) {
        this.list.add(0,number);

    }

    public Integer pop() {
        if (!isArranged) {
            for (int i = list.size() - 1; i >= 0; i--) {
                tempList.add(list.remove(i));
                isArranged = true;
            }
        }

        list.addAll(tempList);
        tempList.clear();
        return list.remove(list.size() - 1);
    }

    public Integer peek() {
        if (!isArranged) {
            for (int i = list.size() - 1; i >= 0; i--) {
                tempList.add(list.remove(i));
                isArranged = true;
            }
        }

        list.addAll(tempList);
        tempList.clear();
        return list.get(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
