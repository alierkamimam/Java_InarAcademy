package chapter.chapter07.homework;

public class exercises24 {
    public static void main(String[] args) {
        int[] pick = new int[4];
        int[] cards=new int[4];


        int total = 0;
        int count = 0;
        while (count < 4) {
            int x = (int) (1 + Math.random() * 52);
            int card = (x % 4) + 1;
            int num = x / 4;
            if (isvalid(card, pick)) {
                cards[count]=num;
                count++;


            }
            total++;
            if (count==4){
                break;
            }
        }
        print(pick,cards);
        System.out.println("Total count: "+total);


    }


    public static boolean isvalid(int card, int[] pick) {
        for (int row = 0; row < pick.length;row++) {
            if (pick[row]==card){
                break;
            }
            if (pick[row] != card){
                if (pick[row]==0){
                    pick[row]=card;
                    return true;
                }
            }

        }
       return false;
    }
    public static void print(int[] pick,int[] cards){
        String[] cardName = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] number = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jACK", "QUEEN", "KING"};
        for (int i = 0; i < pick.length ; i++) {

            System.out.println(number[cards[i]]+" of "+cardName[pick[i]-1]);
        }

    }
}
