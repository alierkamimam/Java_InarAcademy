package chapter.chapter12.homework.exercises17;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercises17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        File file = new File("scores.txt");
        ArrayList<String> list = new ArrayList<>();
        Scanner string = new Scanner(file);
        while (string.hasNext()) {
            String s1 = string.nextLine();
            list.add(s1);
        }

        int randomWord = (int) (Math.random() * list.size());
        String[] s1 = list.get(randomWord).split("");
        ArrayList<String> isThere = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>(Arrays.asList(s1));

        ArrayList<String> print = new ArrayList<>();
        for (int i = 0; i < word.size(); i++) {
            print.add("*");
        }

        int right = 0;
        for (int i = 0; i < word.size() - 1; i++) {
            for (int j = i + 1; j < word.size(); j++) {
                if (word.get(i).equals(word.get(j))) {
                    right++;
                }
            }
        }
        right = word.size() - right;


        int count = 0;
        int missed = 0;


        while (count < (right+1)) {
            System.out.print("Enter a letter in word ");
            System.out.print(print + ">");
            String guess = input.next();

            if (!isThere.contains(guess)) {
                if (word.contains(guess)) {
                    for (int i = 0; i < word.size(); i++) {
                        if (guess.equals(word.get(i))) {
                            isThere.add(word.get(i));
                            print.set(i, guess);

                        }
                    }
                    if (right == count) {
                        if (word.equals(print)) {
                            System.out.println("This word is " + word);
                        } else {
                            missed++;
                           // System.out.println("Enter a letter in word "+print+" >");
                            System.out.println("This word is " + word + "You missed " + missed + " times");

                        }
                    }

                }
                else System.out.println(guess + " is not in the word.");

            }
            else System.out.println(guess + " is already in the word");
            count++;

        }


    }
}


