package chapter.chapter08.execises;



public class _03Random {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int line = 0; line < matrix[row].length; line++) {
                matrix[row][line] = (int) (Math.random()*100);
            }

        }
        methods.print(matrix);


    }

}



