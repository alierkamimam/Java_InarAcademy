package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a string to find the number of characters in the string you want  ");
        String ch = input.next();
        char a = ch.charAt(0);

        if (count(str, a) > 0) {
            System.out.println(count(str,a));
        }
        else{
            System.out.println("no match");
    }

}

    public static int count(String str, char a) {
        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == a) {
                number = i + 1;
                break;

            }

        }
        return number;
    }

}
