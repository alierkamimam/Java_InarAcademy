package chapter.chapter13.checkpoint;

public class cp08 {
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(((Integer) x).compareTo(new Integer(4)));
    }
}