package chapter.chapter07.exercises;

import java.util.Scanner;

public class reversetype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a string");
        String yazi = input.nextLine();

        char[] yazidisi = yazi.toCharArray();
        char[] yazinintersi = revese(yazidisi);

        System.out.println("gidiğiniz yazinin tersi");
        System.out.println(yazinintersi);

    }

    public static char[] revese(char[] yazidisi) {
        char[] yazinintersi = new char[yazidisi.length];
        for (int i = 0, j = yazinintersi.length - 1; i < yazidisi.length; i++, j--) {
            yazinintersi[j] = yazidisi[i];

        }
        return yazinintersi;

    }
}
