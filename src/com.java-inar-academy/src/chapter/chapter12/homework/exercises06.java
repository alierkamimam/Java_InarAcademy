package chapter.chapter12.homework;

import chapter.chapter11.homework.ex02.Person;

import java.util.Scanner;

public class exercises06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a hex value:");
            String hex = input.nextLine();
            hexToDecimal(hex);

        } catch (NumberFormatException e) {
            e.printStackTrace();


        }

    }


    public static void hexToDecimal(String hex) throws NumberFormatException {
        int decimal = 0;
        int pow = -1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexchar = hex.charAt(i);
            if ((hexchar >= 'A' && hexchar <= 'F') || ('0' <= hexchar && hexchar <= '9')) {
                pow++;
                decimal += (int) (hexCharToDecimal(hexchar) * Math.pow(16, pow));

            } else
                throw new NumberFormatException("NumberFormatException");

        }
        System.out.println(decimal + " is the decimal value of " + hex);
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }


}


