package chapter.chapter06.homework;

public class exercises11 {
    public static void main(String[] args) {

        int salesAmount = 10000;

        System.out.println("Sales Amount\t\tComission");
        System.out.println("-----------------------------");

        for (int i = 1; i < 20; i++) {
            System.out.printf("%-17d%12.1f\n", salesAmount, computeComission(salesAmount));
            salesAmount += 5000;

        }


    }


    public static double computeComission(double salesAmount) {
        return  5000.0 * 8 / 100 + 5000.0 * 10 / 100 + (salesAmount - 10000) * 12 / 100;

    }
}
