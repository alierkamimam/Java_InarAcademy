package chapter.chapter08.checkpoint;

import chapter.chapter08.execises.methods;

public class _03 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        methods.print(array);
        System.out.println("array[0][1] is " + array[0][1]);

    }
}
