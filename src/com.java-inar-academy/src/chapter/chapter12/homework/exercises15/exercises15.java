package chapter.chapter12.homework.exercises15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exercises15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("exercises12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 100) + " ");

            }

        }
    }
}

