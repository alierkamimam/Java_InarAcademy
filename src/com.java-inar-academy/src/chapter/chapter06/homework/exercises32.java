package chapter.chapter06.homework;

public class exercises32 {
    public static void main(String[] args) {
        final int LOOP = 10000;
        int count = 0;
        int count1 = 0;
        while (count < LOOP) {
            while (true) {

                int number1 = (int) (Math.random() * 6 + 1);
                int number2 = (int) (Math.random() * 6 + 1);

                System.out.println("Yo rolled " + number1 + " + " + number2 + " = " + (number1 + number2));
                if (exercises30.win(number1, number2)) {

                    System.out.println("YOU WIN");
                    count1++;
                    break;

                }
                if (exercises30.lose(number1, number2)) {
                    System.out.println("YOU LOST");
                    break;


                } else
                    System.out.println("The point is " + (number2 + number1));

                count++;
            }




        }
        System.out.println("You won " + count1 + " times");
    }
}