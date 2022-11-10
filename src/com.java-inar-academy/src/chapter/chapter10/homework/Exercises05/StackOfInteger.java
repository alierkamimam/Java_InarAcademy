package chapter.chapter10.homework.Exercises05;

public class StackOfInteger {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfInteger(int capacity) {
        elements = new int[capacity];

    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        this.elements[size++] = value;
    }

    public int pop() {
        return this.elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;

    }
}