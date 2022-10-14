package chapter.chapter07.homework;

import chapter.chapter07.listing.listing06;
import chapter.chapter07.listing.listing07;
import com.sun.org.apache.bcel.internal.generic.LOR;

public class exercises16 {
    public static void main(String[] args) {
        final int NUMBER = 100_000;

        int[] list = new int[NUMBER];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1_000_000);

        }
        int key = (int) (Math.random() * 1_000_000);
        estimateTimeForLinear(list,key);
        estimateTimeForBinary(list,key);


    }

    public static void estimateTimeForLinear(int[] list, int key) {
        long startTime = System.currentTimeMillis();
        listing06.linearSortin(list, key);
        long endTime = System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.println("The lineaar searh takes "+executionTime+" milisecond");

    }
    public static void estimateTimeForBinary(int[] list,int key){
        long startTime=System.currentTimeMillis();
        listing07.binarySearc(list,key);
        long endTime=System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.println("The Bineary search takes "+executionTime+" milisecond");
    }
}
