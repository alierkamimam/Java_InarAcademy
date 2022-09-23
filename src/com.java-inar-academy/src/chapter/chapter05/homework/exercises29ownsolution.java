package chapter.chapter05.homework;
import java.util.Scanner;
public class exercises29ownsolution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a year:");
        int year=input.nextInt();

        System.out.println("Enter first day of mounth(0:sun,1:mon) ");
        int day =input.nextInt();

        int howday=0;
        int diffirence=0;


        for(int i=1;i<=12;i++){
            String header="";

            switch (i) {
                case 1:
                    howday = 31;
                    diffirence = 0;
                    header = "      January" + year;
                    break;
                case 2:
                    howday = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
                    diffirence = 31;
                    header = "      February" + year;
                    break;
                case 3:
                    howday = 31;
                    diffirence = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
                    header = "      March" + year;
                    break;
                case 4:
                    howday = 30;
                    diffirence = 31;
                    header = "      April" + year;
                    break;
                case 5:
                    howday = 31;
                    diffirence = 30;
                    header = "      May" + year;
                    break;
                case 6:
                    howday = 30;
                    diffirence = 31;
                    header = "      Jun" + year;
                    break;
                case 7:
                    howday = 31;
                    diffirence = 30;
                    header = "      July" + year;
                    break;
                case 8:
                    howday = 31;
                    diffirence = 31;
                    header = "      August" + year;
                    break;
                case 9:
                    howday = 30;
                    diffirence = 31;
                    header = "      September" + year;
                    break;
                case 10:
                    howday = 31;
                    diffirence = 30;
                    header = "      October" + year;
                    break;
                case 11:
                    howday = 30;
                    diffirence = 31;
                    header = "      Novermber" + year;
                    break;
                case 12:
                    howday = 31;
                    diffirence = 30;
                    header = "      December" + year;
                    break;
            }


            day = (day + diffirence) % 7;
            System.out.println(header+"------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for (int a=0;a<day;a++)
                System.out.printf("%6s","");

            for(int a=1;a<=howday;a++){
                if((day+a)%7==0)
                System.out.println(a);
             else
                    System.out.printf("%-6d",a);

            }
            System.out.println();
        }


    }
}


