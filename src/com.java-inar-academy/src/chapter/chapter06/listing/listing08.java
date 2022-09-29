package chapter.chapter06.listing;

import java.util.Locale;
import java.util.Scanner;

public class listing08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a  hex number: ");
        String hex=input.nextLine();

        System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase())) ;

    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i <= hex.length() - 1; i++) {
            char hexchar = hex.charAt(i);
            decimal = decimal * 16 + hexCharToDecimal(hexchar);
        }
        return decimal;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >='A' && ch <= 'F')
            return 10+ch-'A';
        else
            return ch-'0';
    }
}
