package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for array lenght");
        int lenght = input.nextInt();
        int[] list1=new int[lenght];
        int[] list2=new int[lenght];
        System.out.println("Enter "+lenght+" numbers for list1 ");
        for (int i=0;i<lenght;i++){
            list1[i]=input.nextInt();
        }
        System.out.println("Enter "+lenght+" numbers for list2 ");
        for (int i=0;i<lenght;i++){
            list2[i]=input.nextInt();
        }
        if (equals(list1,list2)){
            System.out.println("Two lists are  strictly identical");
        }else
            System.out.println("Two lists are not  strictly identical");




    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }

        }
        return true;
    }
    public static void display(int[] list){
        System.out.print(list+":");
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
