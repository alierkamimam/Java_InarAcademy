package chapter.chapter07.listing;

public class listing03 {
    public static void main(String[] args) {
        int[] a = {4, 2};

        System.out.println("before invoking swap");
        System.out.println("array is{" + a[0] + "," + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("after invoking swap");
        System.out.println("array is{" + a[0] + "," + a[1] + "}");


        System.out.println("before invoking swapfirstwoınarray");
        System.out.println("array is{" + a[0] + "," + a[1] + "}");
        swapFirstTwoInArry(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");


    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArry(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
