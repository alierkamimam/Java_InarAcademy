package week.wee07;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //nestedForLoop();
        Scanner input=new Scanner(System.in);
        int breakpoint=input.nextInt();
        breakLoop(breakpoint);
    }
    public static void nestedForLoop(){
        for (int satir=1;satir<=3;satir++){
            for(int sutun = 1; sutun <=3; sutun++){
                System.out.printf("%d, %d\n",satir, sutun);
            }
            System.out.println("sütünlar bitti");
        }


    }
    public static void breakLoop(int breakpoint){
        for(int i=0;i<=10;i++){
            if(i==breakpoint){
                break;
            }
            System.out.println(i);
        }


    }
}

