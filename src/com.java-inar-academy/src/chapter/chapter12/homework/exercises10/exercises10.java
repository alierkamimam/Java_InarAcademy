package chapter.chapter12.homework.exercises10;

import java.util.Scanner;

public class exercises10 {
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
