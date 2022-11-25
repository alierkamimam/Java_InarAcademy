package chapter.chapter12.homework.exercises19;



import java.io.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class exercises19 {
    public static void main(String[] args) {

        System.out.println("Enter a URL:");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String word = input.nextLine();
                System.out.println(word);
                String[] s = word.split("\\s");
                if (s.length == 1 && s[0].equals("")) continue;
                count += s.length;
            }
            System.out.println("Number of words in the files " + count);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");

        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }


    }
}
