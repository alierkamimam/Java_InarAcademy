package chapter.chapter12.homework.exercises11;

import java.io.*;

import java.util.Scanner;

public class exercises11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 word filename");
            System.exit(0);
        }
        File file = new File(args[1]);

        String newStr = "";
        String s = "";

        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(file);

        while (input.hasNext()) {
            s = input.nextLine();
            newStr += s.replaceAll(args[0] + "", "") + "\n";
        }
        output.print(newStr);

        input.close();
        output.close();

    }
}
