package week_13.assignments;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> arrayList = new ArrayList<>();

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public int getSize() {
        return arrayList.size();
    }

    public Object peek() {
        return arrayList.get(arrayList.size() - 1);
    }

    public Object pop() {
        return arrayList.remove(arrayList.size() - 1);
    }

    public void push(Object o) {
        arrayList.add(o);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arrayList=" + arrayList +
                '}';
    }


    @Override
    public MyStack clone() {
        try {
            MyStack clone = (MyStack) super.clone();
            clone.arrayList = new ArrayList<>(this.arrayList);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
