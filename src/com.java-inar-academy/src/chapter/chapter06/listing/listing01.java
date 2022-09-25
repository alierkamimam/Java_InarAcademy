package chapter.chapter06.listing;

public class listing01 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k + "\n");

        int a = sign(k);
        System.out.println(k + " is : " + a);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2) {
            result = num1;
        } else
            result = num2;

        return result;
    }

    public static int sign(int n) {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return -1;

    }
}

