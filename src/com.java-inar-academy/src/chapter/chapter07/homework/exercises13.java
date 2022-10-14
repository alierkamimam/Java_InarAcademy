package chapter.chapter07.homework;

public class exercises13 {
    public static void main(String[] args) {
        int s1 = 7, s2 = 34, s3 = 21, s4 = 15, s5 = 14, s6 = 52;
        int number = getRandom(s1, s2, s3);
        int number1 = getRandom(s1, s2, s3, s4, s5, s6);
        System.out.println("Number 1 is " + number);
        System.out.println("Number 2 is " + number1);

    }

    public static int getRandom(int... numbers) {
        int number = (int) (1 + Math.random() * 53);
        while (include(numbers, number)) {
            number = (int) (1 + Math.random() * 53);
        }
        return number;

    }

    public static boolean include(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return true;
        }
        return false;
    }

}
