package chapter.chapter10.listing;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters. \nis " + s + " a polidrome?  " + isPolidrome(s));


    }

    private static boolean isPolidrome(String s) {
        String s1 = filter(s);

        String s2 = reverse(s1);

        return s2.equals(s1);

    }

    private static String reverse(String s1) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        return stringBuilder.reverse().toString();

    }

    private static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();

    }
}
