package chapter.chapter12.listing;

import java.io.*;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
        }

        try (
                PrintWriter scores = new PrintWriter(file);
        ) {
            scores.print("John T Smith ");
            scores.println(90);
            scores.print("Eric K Jones ");
            scores.println(85);
        }


    }
}
