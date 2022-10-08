package chapter.chapter06.homework;

import java.util.EventListener;
import java.util.Scanner;

public class exercises21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int a = getNumber(str.charAt(i));
            if (a == 1)
                System.out.print(str.charAt(i));
            else
                System.out.print(a);


        }

    }

    public static int getNumber(char uppercaseLetter) {
        char ch1 = Character.toUpperCase(uppercaseLetter);
        if (ch1 >= 'W')
            return 9;
        else if (ch1 >= 'T')
            return 8;
        else if (ch1 >= 'P')
            return 7;
        else if (ch1 >= 'O')
            return 6;
        else if (ch1 >= 'J')
            return 5;
        else if (ch1 >= 'G')
            return 4;
        else if (ch1 >= 'D')
            return 3;
        else if (ch1 >= 'A')
            return 2;
        else
            return 1;


    }

}



