package chapter.chapter06.homework;

public class exercises13 {
    public static void main(String[] args) {

        System.out.println("i               m(i)");
        for (int i = 1; i < 21; i++) {
            System.out.printf("%-12d%9.4f\n", i, sumSeries(i));
        }


    }

    public static double sumSeries(double a) {
        double sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += (i * 1.0 / (i + 1));

        }
        return sum;

    }
}
