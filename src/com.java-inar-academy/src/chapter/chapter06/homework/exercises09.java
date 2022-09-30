package chapter.chapter06.homework;

public class exercises09 {
    public static void main(String[] args) {

        double meter = 20.0;
        double foot = 1.0;

        System.out.println("Feet     Meters     |       Meters     Feet");
        System.out.println("*******************************************************************");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-9.1f%-10.3f\t|\t\t%-10.1f%-7.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
            meter += 5.0;
            foot += 1.0;
        }

    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;

    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;

    }
}
