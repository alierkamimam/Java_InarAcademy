package chapter.chapter06.homework;

public class exercises14 {
    public static void main(String[] args) {
        System.out.println("i                  m(i)");
        System.out.println("-----------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-17d%1.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int a) {
        double sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * sum;
    }
}
