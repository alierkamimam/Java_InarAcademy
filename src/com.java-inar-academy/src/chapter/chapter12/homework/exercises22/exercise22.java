package chapter.chapter12.homework.exercises22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }

        File directory = new File(args[0]);
        if (!directory.exists()) {
            System.out.println("Source file " + args[0] + " doesn't exists ");
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);

        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);

                    } else
                        replaceString(files[i], args);
                }
            }
        }


    }

    public static void replaceString(File file, String[] args) throws IOException {
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(System.in);

        ) {
            while (input.hasNext()) {
                s = input.nextLine();
                list.add(s.replace(args[1], args[2]));

            }
        }
        try (
                PrintWriter output = new PrintWriter(file);

        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }

        }
    }

}

