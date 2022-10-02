package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = input.nextLine();

        System.out.println("This string have " + countLetters(a) + " letters;");


    }

    public static int countLetters(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

}
