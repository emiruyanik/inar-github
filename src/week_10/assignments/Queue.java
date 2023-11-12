package week_10.assignments;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }

    public void enQueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int deQueue() {
        int result = elements[0];
        size--;
        int[] temp = new int[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = elements[i + 1];
        }
        elements = temp;
        return result;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
