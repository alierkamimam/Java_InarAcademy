package chapter.chapter07.homework;

public class exercises29 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            ;
            int[] deck = getDeck();
            print(deck);
            int sum = sum(deck);
            System.out.println("The sum is " + sum);
            System.out.println("---------------");
            count++;
            if (sum(deck) == 24) {

                System.out.println("Count is " + count);
                break;
            }

        }


    }

    public static int[] getDeck() {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * 13);


        }
        return array;
    }

    public static void print(int[] deck) {
        String[] cards = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "KING", "QUEEN", "JACK"};
        for (int i = 0; i < deck.length; i++) {
            System.out.println(cards[deck[i]]);
        }
    }

    public static int sum(int[] deck) {
        int sum = 0;
        for (int i = 0; i < deck.length; i++) {
            sum += deck[i] + 1;

        }

        return sum;
    }

}
