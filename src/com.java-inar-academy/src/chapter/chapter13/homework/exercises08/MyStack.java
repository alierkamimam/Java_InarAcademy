package chapter.chapter13.homework.exercises08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object getSize() {
        return list.size();
    }

    public Object pop() {
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public Object clone() throws CloneNotSupportedException {
        MyStack myStackClone = (MyStack) super.clone();
        myStackClone.list = (ArrayList<Object>) list.clone();
        return myStackClone;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
