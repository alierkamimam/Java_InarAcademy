package chapter.chapter06.checkpoint;

public class _6_13_d {
    public static void main(String[] args) {
        int i=0;
        while (i<=4){
            method1(i);
        i++;
        }

    }
    public static void method1(int i){
        do{
            if (i % 3 !=0)
                System.out.println(i+" ");
            i--;
        }while (i>=1);
        System.out.println();
    }
}
