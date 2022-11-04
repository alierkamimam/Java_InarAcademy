package chapter.chapter09.homework;

import java.util.Random;

public class Exercises04 {
    public static void main(String[] args) {
        Random str=new Random(1000);

        for (int i = 0; i <=50 ; i++) {
            if ((i+1)%10==0){
                System.out.println(str.nextInt(100));
            }else
                System.out.print(str.nextInt(100)+" ");
        }
    }
}
