package chapter.chapter12.exercises;

import java.io.File;

public class ex02 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        listFile(file);

    }

    private static void listFile(File file) {
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                System.out.println(f.getAbsolutePath());
            }


        }
    }
}
