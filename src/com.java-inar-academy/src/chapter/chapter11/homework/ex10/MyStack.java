package chapter.chapter11.homework.ex10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public static final int DEFAULT_CAPACITY = 16;

    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyStack(int capacity) {
        super(capacity);
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public Object getSize() {
        return super.size();
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }

    public void push(Object o) {
        super.add(o);

    }

    @Override
    public String toString() {
        return "Stack : " + super.toString();
    }
}
