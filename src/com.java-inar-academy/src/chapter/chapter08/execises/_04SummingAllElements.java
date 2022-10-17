package chapter.chapter08.execises;

public class _04SummingAllElements {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        methods.RandomGenarate(matrix);
        methods.print(matrix);
        System.out.println("----------------");
        int a =methods.SummingTotal(matrix);
        System.out.println("Total= "+a);

            }
        }
