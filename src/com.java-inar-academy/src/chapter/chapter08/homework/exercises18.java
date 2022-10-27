package chapter.chapter08.homework;


import java.util.Scanner;

public class exercises18 {
    public static void main(String[] args) {
        System.out.println("Enter five points:");
        int[][] m =getFromUser();
        shuffle(m);
        chapter.chapter08.execises.methods.print(m);


    }

    public static void shuffle(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            int x = (int) (Math.random() * 5);
            int temp = m[row][0];
            m[row][0] = m[x][0];
            m[x][0] = temp;

            int temp1 = m[row][1];
            m[row][1] = m[x][1];
            m[x][1] = temp1;

        }
    }
    public static int[][] getFromUser() {
        Scanner input=new Scanner(System.in);

        int[][] a = new int[5][2];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < a[0].length; col++) {
                a[row][col] = input.nextInt();
            }
        }
        return a;
    }
}
