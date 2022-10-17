package chapter.chapter08.execises;

public class methods {
    public static void main(String[] args) {

    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }

    public static void RandomGenarate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int line = 0; line < matrix[row].length; line++) {
                matrix[row][line] = (int) (Math.random() * 100);

            }
        }
    }

    public static int SummingTotal(int[][] matrix) {
        int total = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }

    public static void Summingelementsbycolumn(int[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int[] ints : matrix)
                total += ints[column];
            System.out.println("Sum for column " + column + " is "
                    + total);

        }


    }

    public static void SummingElementsRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];

            }
            System.out.println("Sum for row " + row + " is "
                    + total);

        }

    }
    public static void LargestRow(int[][] matrix){
        int MaxRow=0;
        int IndexOfMaxRow=-1;
        for (int column=0;column<matrix[0].length;column++){
            MaxRow+=matrix[0][column];
        }
        for (int row=1;row<matrix.length;row++){
            int totalOfThisRow = 0;
            for (int column=0;column<matrix[row].length;column++){
                totalOfThisRow+=matrix[row][column];

                if (totalOfThisRow>MaxRow){
                    MaxRow=totalOfThisRow;
                    IndexOfMaxRow=row;
                }
            }
        }
        System.out.println("Row " + IndexOfMaxRow
                + " has the maximum sum of " + MaxRow);


    }
    public static void RandomShuffle(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[row].length);

                int temp = matrix[row][column];
                matrix[row][column] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }

        }
    }

}