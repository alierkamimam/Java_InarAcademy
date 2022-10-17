package chapter.chapter08.execises;

public class _08RandomShuffling {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        methods.RandomGenarate(matrix);
        methods.print(matrix);
        methods.RandomShuffle(matrix);
        System.out.println("------------------------------");
        methods.print(matrix);

    }
}
