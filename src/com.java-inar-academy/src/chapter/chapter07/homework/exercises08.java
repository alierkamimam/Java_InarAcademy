package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array=new double[10];
        System.out.println("Enter  ten digit :");
        for (int i=0;i<array.length;i++){
            array[i]=input.nextDouble();
        }
        int sumint= (int) average(array);
        double sumdouble=average(array);
        System.out.println("integer average is :"+sumint);
        System.out.println("Double average is: " + sumdouble);



    }
    public static int average(int[] array){
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;

    }
    public static double average(double[] array){
       double sum=0;
        for (int i=0;i< array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;

    }

    }
