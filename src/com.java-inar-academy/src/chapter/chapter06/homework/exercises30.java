package chapter.chapter06.homework;

public class exercises30 {
    public static void main(String[] args) {

        while (true) {

            int number1 = (int) (Math.random() * 6 + 1);
            int number2 = (int) (Math.random() * 6 + 1);
            System.out.println("Yo rolled " + number1 + " + " + number2 + " = " + (number1 + number2));
            if (win(number1, number2)) {

                System.out.println("you win");
                break;

            } else if (lose(number1, number2)) {

                System.out.println("You lost");
                break;

            } else
                System.out.println("The point is " + (number2 + number1));
        }


    }

    public static boolean win(int number1, int number2) {
        return (number2 + number1 == 7 || number1 + number2 == 11);

    }

    public static boolean lose(int number1, int number2) {
        return (number2 + number1 == 2 ||
                number1 + number2 == 3 ||
                number1 + number2 == 12);


    }

}

