package chapter.chapter12.listing;

import java.io.*;

public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }


    }
}
