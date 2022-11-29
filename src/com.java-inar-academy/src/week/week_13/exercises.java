package Week.week_13;

import java.io.File;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter the gender(M/F)");
        char gender = input.next().charAt(0);
        System.out.println("Enter the name;");
        String name = input.next();


        File file = new File("C:\\Users\\Ali Erkam İMAM\\workspace\\Java_InarAcademy\\src\\com.java-inar-academy\\src\\Week\\week_13\\babynameranking" + year + ".txt");
        if (!file.exists()) {
            System.out.println("No such file");
            System.exit(1);
        }

        try (
                Scanner input2 = new Scanner(file);
        ) {
            while (input2.hasNext()) {
                int num = input2.nextInt();
                String maleName = input2.next();
               // double maleBirthDay = input2.nextDouble();
                String femaleName = input2.next();
                //double femaleBirthDay = input2.nextDouble();

                if ((gender == 'M' && name.equals(maleName)) || (gender == 'F' && name.equals(femaleName))) {
                    System.out.println(name + " is ranked #" + num + " in year " + year);
                    break;

                }
                System.out.println("The name " + name + " is not ranked in year " + year);
                break;
            }


        }


    }

}
