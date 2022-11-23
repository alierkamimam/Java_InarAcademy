package chapter.chapter12.homework;

import java.util.Scanner;

public class OutOfMemory {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array={1,2,3,4,5,6,67};
        try {
            System.out.print("Enter index of array:");
            int in=input.nextInt();
            System.out.println(array[in]);
        }catch (OutOfMemoryError ex){
            ex.printStackTrace();
        }



        
    }

}
