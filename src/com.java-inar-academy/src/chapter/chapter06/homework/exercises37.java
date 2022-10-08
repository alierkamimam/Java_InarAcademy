package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the width : ");
        int width = input.nextInt();
        String format = format(number, width);
        System.out.println(format);
    }


    public static String format(int number,int widht){
        String result=number+"";

        if (result.length()>widht)
            return result;

        while (result.length()<widht){
            result='0'+result;

        }
        return result;
    }
}
