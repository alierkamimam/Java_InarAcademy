package chapter.chapter08.execises;

public class _07LargestRowSum {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        System.out.println("Generating Numbers");
        methods.RandomGenarate(matrix);
        methods.print(matrix);
        System.out.println("****************");
        methods.SummingElementsRow(matrix);
        System.out.println("****************");
        methods.LargestRow(matrix);




    }
}
