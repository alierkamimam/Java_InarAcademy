package chapter.chapter07.homework;
import java.util.Scanner;

public class exercises21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine:");
        int slots = input.nextInt();
        int[] slot = new int[slots];
        beanMachine(slots, slot, balls);
        display(balls,slots,slot);
    }

    public static void beanMachine(int slots, int[] slot, int balls) {
        int count = 0;
        while (count < balls) {
            int total = 0;
            String str = "";


            for (int i = 0; i < slots; i++) {
                int x = (int) (Math.random() * 2);
                total += x;
                if (x == 0) {
                    str += "L";
                } else {
                    str += "R";
                }
            }
            slot[total]++;
            count++;
            System.out.println(str);
        }

    }
    public static void display(int balls,int slots,int[] slot){
        for (int i = 0, number = 5; i < balls && number > 0; i++, number--) {
            for (int j = 0; j < slots; j++) {
                if (slot[j] >= number) {
                    slot[j]--;
                    System.out.print("0");
                } else System.out.print("");
            }
            System.out.println();
        }
    }
}



