package chapter.chapter09.homework;

public class Exercises06 {
    public static void main(String[] args) {
        final int NUMBER = 100000;
        int[] array = getNumber(NUMBER);
        //print(array);
       // System.out.println("\n-----------------------");
        StopWatch time = new StopWatch();
        sort(array);
        time.stop();
       // print(array);
        System.out.println("The array sorted " + (time.getElapsedTime() / 1000) + "second");


    }

    public static int[] getNumber(int number) {
        int[] result = new int[number];
        for (int row = 0; row < number; row++) {
            result[row] = (int) (Math.random() * 100);


        }
        return result;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(array[i]);
            }
            System.out.print(array[i]+" ");
        }
    }
}

