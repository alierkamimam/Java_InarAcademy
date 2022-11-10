package chapter.chapter10.homework.Exercises10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);
        }

        int size=q.getSize();

        for (int i = 0; i < size; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();

        System.out.println(q.getSize());


    }


}

