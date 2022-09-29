package chapter.chapter06.listing;

public class listing04 {
    public static void main(String[] args) {
        int x=1;
        System.out.println("before the call , x is "+x);
        increment(x);
        System.out.println("after the call ,x is "+x);

    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is "+n);
    }
}
