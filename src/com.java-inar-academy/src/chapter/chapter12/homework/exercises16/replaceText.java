package chapter.chapter12.homework.exercises16;

import java.io.*;
import java.util.Scanner;

public class replaceText {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java replaceText sourceFile oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " doesn't exists ");
            System.exit(2);
        }

        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(file);
        String s1;
        while (input.hasNext()) {
            s1 = input.nextLine();
            s1 = s1.replaceAll(args[1], args[2]);
            output.println(s1);
        }
        input.close();

    }
}
