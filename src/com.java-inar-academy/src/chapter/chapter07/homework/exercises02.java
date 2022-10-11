package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a ten digit:");

        int[] numbers=new int[10];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        int[] reverse=new int[numbers.length];
        System.out.print("The reverse is ");

        for (int i = 0, j=numbers.length-1;i<reverse.length;i++,j--){
            reverse[i]=numbers[j];
            System.out.print(reverse[i]+" ");
        }


    }
}
