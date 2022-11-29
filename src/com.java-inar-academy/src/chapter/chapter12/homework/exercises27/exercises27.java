package chapter.chapter12.homework.exercises27;

import chapter.chapter09.exercises.F;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exercises27 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file's path and name:");
        String name = input.next();

        File file = new File(name);
        if (!file.exists()) {
            System.out.println("There isn't any file ");
            System.exit(1);
        }

        int[] occurrencesOfChars = countTheLetters(file);

        displayOccurrencesOfLetters(occurrencesOfChars);
    }


    private static void displayOccurrencesOfLetters(int[] occurrencesOfChars) {
        for (int i = 0; i < occurrencesOfChars.length; i++) {
            System.out.printf("Number of %c's: %d\n", ('A' + i), occurrencesOfChars[i]);
        }
    }

    private static int[] countTheLetters(File file) throws IOException {
        int[] countLetter = new int['Z' - 'A' + 1];
        String s;
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                s = input.next().toUpperCase();
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isLetter(s.charAt(i))) {
                        countLetter[s.charAt(i) - 'A']++;
                    }
                }
            }
        }
        return countLetter;
    }


}