package chapter.chapter12.homework.exercises14;

import java.io.File;
import java.util.Scanner;

public class exercises14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a path");
        String path = input.nextLine();

        File file = new File(path);
        input = new Scanner(file);
        int count = 0;
        double sum = 0;

        while (input.hasNext()) {
            sum += input.nextDouble();
            count++;


        }
        input.close();

        System.out.println("The sum is : "+(sum/count)+"\nCount of Number : "+count);


}
}
