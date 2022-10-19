package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises04 {
    public static void main(String[] args) {
        int[][] array = getFromUser();
        int[] sum = sum(array);
        int[] index = sorted(sum);
         display(index,array);

    }

    public static int[][] getFromUser() {
        int[][] array = new int[8][7];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter daily working time in week 8 worker of company");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }

        }
        return array;

    }

    public static int[] sum(int[][] array) {
        int[] sum = new int[8];
        for (int row = 0; row < array.length; row++) {
            int total = 0;
            for (int column = 0; column < array[row].length; column++) {
                total += array[row][column];
            }
            sum[row] = total;
        }
        return sum;
    }

    public static int[] sorted(int[] sum) {
        int[] index = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int row = 0; row < sum.length - 1; row++) {
            int max = sum[row];
            int maxOfIndex = row;
            for (int column = row + 1; column < sum.length; column++) {

                    if (max < sum[column]) {
                        max=sum[column];
                        maxOfIndex = column;
                    }
                }

                if (maxOfIndex != row) {
                    sum[maxOfIndex] = sum[row];
                    sum[row] = max;


                    int temp = index[maxOfIndex];
                    index[maxOfIndex] = index[row];
                    index[row] = temp;
                }

            }
            return index;

        }
         public static void display(int[] index,int[][] array){
             System.out.println("            Su   M   T   W   Th  F  Sa");
             for (int i = 0; i <index.length ; i++) {
                 System.out.print("Employee "+index[i]+"|  ");
                 for (int column=0;column<array[i].length;column++){
                     System.out.print(array[index[i]][column]+"   ");
                 }
                 System.out.println();

             }

         }
    }


