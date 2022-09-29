package chapter.chapter06.checkpoint;

public class _6_13_c {
    public static void main(String[] args) {
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);

        nPrintln("welcome to java", times);

        System.out.println("After the call,"
                + " variable times is " + times);


    }

    public static void nPrintln(String message, int n) {
        while (n > 0) {
            System.out.println("n= " + n);
            System.out.println(message);
            n--;
        }

    }

}
