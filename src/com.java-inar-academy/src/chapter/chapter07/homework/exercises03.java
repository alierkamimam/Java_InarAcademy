package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers  between 1 and 100");
        int numbers = input.nextInt();
        int[] countnum = new int[100];

        while (numbers != 0) {
            numbers = input.nextInt();
            if (numbers == 0) {
                break;
            }
            countnum[numbers - 1]++;

        }
        for (int i = 0; i < countnum.length; i++) {
            if (countnum[i] != 0) {

                System.out.println((i + 1) + " occurs " + countnum[i]+" "+((countnum[i] == 1) ? "time" : "times"));
            }


        }
    }
}
