package chapter.chapter06.homework;



public class exercises08 {
    public static void main(String[] args) {


        double celcius = 40.0;
        double fahrenheit = 120.0;

        System.out.println("Celcius   Fahrenheit    |   Fahrenheit   Celcius");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f%-10.1f\t|\t%-13.1f%-10.1f\n", celcius, celciusToFahrenheit(celcius),
                    fahrenheit, fahrenheitToCelcius(fahrenheit));
            celcius -= 1.0;
            fahrenheit -= 10;
        }
    }


    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
