package chapter.chapter12.homework.exercises23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class exercises23 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL:");
        String Url = input.next();

        double sum = 0;
        double count = 0;
        URL url = new URL(Url);

        try (
                Scanner input2 = new Scanner(url.openStream());
        ) {
            while (input2.hasNext()) {
                sum += input2.nextDouble();
                count++;
            }
        }
        System.out.println("Sum of Numbers : " + sum);
        System.out.println("Average: " + (sum / count));


    }
}
