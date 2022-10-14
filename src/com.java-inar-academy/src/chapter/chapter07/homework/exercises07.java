package chapter.chapter07.homework;

public class exercises07 {
    public static void main(String[] args) {
        int[] number = new int[100];
        int [] array=generateNumber(number);
        printNumber(array);
        int[] count=count(array);
        displayCount(count);

    }

    public static int[] generateNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 10);
        }
        return number;
    }

    public static int[] count(int[] number) {
        int[] counts = new int[10];
        for (int i = 0; i < number.length; i++) {
            counts[number[i]]++;
        }
        return counts;

    }

    public static void printNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(number[i]);
            } else
                System.out.print(number[i] + " ");
        }
        System.out.println("----------------------------------");
    }
    public static void displayCount(int[] result){
        for (int i=0;i<result.length;i++){
            System.out.println(i+" occur "+ result[i]+" times ");

        }

    }


}


