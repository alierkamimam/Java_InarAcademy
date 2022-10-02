package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String a = input.nextLine();

        if (atleasteightcharacter(a) && isletteranddigit(a) && isdigit(a) >= 2){
            System.out.println("valid password.");
        }else
            System.out.println("invalid password.");


    }

    public static boolean atleasteightcharacter(String a) {
        return a.length() >= 8;

    }

    public static boolean isletteranddigit(String a) {
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!(Character.isDigit(ch) || Character.isLetter(ch))) {
                return false;
            }


        }
        return true;

    }

    public static int isdigit(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isDigit(ch)) {
                count++;

            }

        }
        return count;

    }
}
