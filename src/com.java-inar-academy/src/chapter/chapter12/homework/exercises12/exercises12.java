package chapter.chapter12.homework.exercises12;

import java.io.*;
import java.util.Scanner;

public class exercises12 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 filename");
            System.exit(1);
        }
        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File " + args[0] + " not found");
            System.exit(2);
        }
        String s = "";

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                s += input.nextLine() + " \n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print(s);
        }
    }
}
