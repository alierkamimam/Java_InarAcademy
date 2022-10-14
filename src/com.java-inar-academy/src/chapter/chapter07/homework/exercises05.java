package chapter.chapter07.homework;


import java.util.Scanner;

public class exercises05 {
    public static void main(String[] args) {

        int[] distincNumber = new int[10];
        int distincnum = 0;
        System.out.print("Enter ten numbers:");
        int[] numbers = getFromUser();
        for (int i = 0; i < numbers.length; i++) {
            if (contains(numbers[i], distincNumber, distincnum)) {
                distincNumber[distincnum] = numbers[i];
                distincnum++;
            }
        }
        disPlayArray(distincNumber,distincnum);

    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;

    }
    public static boolean contains(int number,int[] distincNumber,int distincNum){
        for (int n=0;n<distincNum;n++){
            if (number==distincNumber[n])
                return false;
        }
        return true;
    }
    public static void disPlayArray(int[] distinNumber,int distincNum){
        System.out.println("Total number of distinc numbers: "+distincNum);
        for (int i=0;i<distincNum;i++){
            System.out.print(distinNumber[i]+" ");
        }
    }

}

