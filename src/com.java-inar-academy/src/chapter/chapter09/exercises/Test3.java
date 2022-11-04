package chapter.chapter09.exercises;

public class Test3 {
    public static void main(String[] args) {
        Count c=new Count();
        int times=0;

        for (int i = 0; i < 100; i++) {
            increment(c,times);
            System.out.println("count is"+ c.count);
            System.out.println("time is "+ times);

        }

    }
    public static void increment(Count c,int times){
        c.count++;
        times++;
    }
}
