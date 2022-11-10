package chapter.chapter10.homework.Exercises10;

public class Queue {
    //first in first out

    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public int[] getElements() {
        return this.elements;
    }

    public int getSize() {
        return this.size;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2 + 1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int result = elements[0];
        for (int i = 1; i < getSize(); i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return result;

    }

    public boolean empty() {
        return this.size == 0;
    }


}
