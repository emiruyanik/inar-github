package week_11.assignments;

import java.util.ArrayList;


public class MyStack extends ArrayList {

    private ArrayList<Object> list;

    public MyStack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public Object peek() {
        return this.list.get(size() - 1);
    }

    public Object pop() {
        Object o = this.list.get(list.size() - 1);
        this.list.remove(list.size() - 1);
        return o;

    }

    public void push(Object o) {
        this.list.add(o);
    }

    @Override
    public String toString() {
        return "stack:" + list.toString();
    }
}
