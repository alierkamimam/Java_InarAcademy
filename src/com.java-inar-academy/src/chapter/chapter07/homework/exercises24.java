package chapter.chapter07.homework;

public class exercises24 {
    public static void main(String[] args) {
        /*int[] deck = new int[52];
        initiliaze(deck);
        shuffle(deck);

        int[] pick = new int[4];
        int numberOfPick = pickCards(deck, pick);

        display(deck);

        System.out.println("Number of picks:" + numberOfPick);


    }

    public static void initiliaze(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);


            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }


    }
    public static int pickCards(int[] deck,int[] pick){
        int countpick=0;

        while (!hasOneOfEachSuit(pick)){
            countpick++;
            for (int i=0;i<4;i++){
                pick[i]=(int) (Math.random()*52);
            }
        }

    }

    private static boolean hasOneOfEachSuit(int[] pick) {
        for (int i = 0; i < pick.length - 1; i++) {
            for (int j = i + 1; j < pick.length; j++) {

                int suit1 = pick[i] / 13;
                int suit2 =pick[j] / 13;

                if (suit1 == suit2) {
                    return false;
                }
            }
}
*/
    }
}