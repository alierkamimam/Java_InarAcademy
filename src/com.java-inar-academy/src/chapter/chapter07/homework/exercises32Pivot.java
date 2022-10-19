package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises32Pivot {
    public static void main(String[] args) {
        int[] list = getFromUser();
        int pivot = partition(list);
        display(pivot,list);

    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static int partition(int[] list) {
        int pivotindex = 0;
        int pivot = list[0];
        int low = 1;
        int high = (list.length - 1);


        while (low <= high) {
            while (true) {
                if (pivot >= list[low]) {
                    int temp = list[low];
                    list[low] = list[pivotindex];
                    list[pivotindex] = temp;
                    pivotindex++;
                    low++;
                } else {
                    break;
                }
            }
            while (true) {
                if (pivot > list[high]) {
                    int temp = list[low];
                    list[low] = list[high];
                    list[high] = temp;
                    high--;
                    break;
                } else {
                    high--;
                    break;
                }

            }
        }

        return pivot;
    }
    public static void display(int pivot,int[] list){
        System.out.println("The pivot is: "+pivot);
        System.out.println("After yhe partition, the list is: ");
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }

}
