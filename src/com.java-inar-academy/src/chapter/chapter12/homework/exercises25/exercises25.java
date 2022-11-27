package chapter.chapter12.homework.exercises25;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class exercises25 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       // System.out.print("Enter a URL:");
      //  String Url = input.next();

        double sumForAssistant = 0;
        double sumForAssociate = 0;
        double sumForFull = 0;

        int countAssistant = 0;
        int countAssociate = 0;
        int countFull = 0;

      //  URL url = new URL(Url);
        File file=new File("Salary.txt");

        try (
                Scanner input2 = new Scanner(file);

        ) {
            while (input2.hasNext()) {
                String name = input2.next();
                String lastName = input2.next();
                String job = input2.next();

                if (job.equals("assistant")) {
                    sumForAssistant += input2.nextDouble();
                    countAssistant++;
                } else if (job.equals("associate")) {
                    sumForAssociate += input2.nextDouble();
                    countAssociate++;
                } else
                    sumForFull += input2.nextDouble();
                countFull++;
            }

        }
        System.out.printf("Total salary for assistant %10.2f\nAverage salary for assistant %6.2f \n", sumForAssistant, (sumForAssistant / countAssistant));
        System.out.printf("Total salary for associate %10.2f\nAverage salary for associate %6.2f \n", sumForAssociate, (sumForAssociate / countAssociate));
        System.out.printf("Total salary for full %10.2f\nAverage salary for full %6.2f \n", sumForFull, (sumForFull / countFull));

    }
}
