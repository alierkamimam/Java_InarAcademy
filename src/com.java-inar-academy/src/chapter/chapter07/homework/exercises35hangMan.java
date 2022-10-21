package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises35hangMan {
   /* public static void main(String[] args) {
        String[] word = getFromUserWord();
        char[] str = randomWord(word);
        display(str);
    }

    public static String[] getFromUserWord() {
        Scanner input = new Scanner(System.in);
        String[] word = new String[5];
        System.out.println("Enter five words:");
        for (int i = 0; i < word.length; i++) {
            word[i] = input.nextLine();

        }
        return word;

    }

    public static char[] randomWord(String[] word) {
        int randomNumber = (int) (Math.random() * 5);
        return word[randomNumber].toCharArray();

    }
    public static void display(char[] str) {
        Scanner input = new Scanner(System.in);
        char[] display = new char[str.length];
        for (int i = 0; i < display.length; i++) {
           display[i] = '*';
        }
        int count=0;
        while (count<display.length) {
            System.out.print("Enter a letter in the word ");
            for (int i = 0; i < display.length; i++) {
                System.out.print(display[i]);
            }
            System.out.println();
            String s=input.nextLine();
            char ch=s.charAt(0);


            for (int i=0;i<str.length;i++) {
                if (ch == str[i]) {

                    display[i] = ch;
                    continue;
                }





                }
            count++;
            }
        }
    }
}
*/
}