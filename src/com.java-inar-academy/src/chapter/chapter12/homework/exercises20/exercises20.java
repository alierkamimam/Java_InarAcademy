package chapter.chapter12.homework.exercises20;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class exercises20 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }

        File dir = new File(args[0]);

        if (!dir.exists()) {
            System.out.println(dir.getName() + " is not exists!");
            System.exit(2);
        }
        if (!dir.isDirectory()) {
            System.out.println(dir.getName() + " is not a directory!");
            System.exit(3);
        }


        ArrayList<File> directories = new ArrayList<>();
        directories.add(dir);

        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    }
                    if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                        removePackageNameFromFirstline(files[i]);
                    }
                }
            }
        }
    }

    private static void removePackageNameFromFirstline(File file) throws IOException {
        String s = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            String firstLine = input.nextLine();

            while (input.hasNext()) {
                s += input.nextLine() + "\n";
            }

            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                output.print(s);
            }
        }
    }
}
