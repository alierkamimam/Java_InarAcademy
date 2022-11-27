package chapter.chapter12.homework.exercises24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exercises24 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }
        try (
                PrintWriter output = new PrintWriter(file);

        ) {
            for (int i = 1; i < 1000; i++) {
                int number = (int) (Math.random() * 3);
                switch (number) {
                    case 0:
                        output.printf("FirsName" + i + " LastName" + i + " assistant %-6.2f\n" , ((Math.random() * 30_000) + 50_000));
                        break;
                    case 1:
                        output.printf("FirsName" + i + " LastName" + i + " associate %-6.2f\n", + ((Math.random() * 50_000) + 60_000));
                        break;
                    case 2:
                        output.printf("FirsName" + i + " LastName" + i + " full %13.2f\n" , ((Math.random() * 55_000) + 75_000));
                        break;
                }


            }

        }
    }
}
