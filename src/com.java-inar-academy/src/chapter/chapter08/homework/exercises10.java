package chapter.chapter08.homework;

public class exercises10 {
    public static void main(String[] args) {
        int[][] array = randomGenate();
        print(array);
        int[] totalRow = totalRow(array);
        int[] totalCol = totalCol(array);
        int largestRow = largestRow(totalRow);
        int largestCol = largestCol(totalCol);
        System.out.println("The largest row index: " + largestRow);
        System.out.println("The largest column index: " + largestCol);


    }

    public static int[][] randomGenate() {
        int[][] arr = new int[4][4];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static void print(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[] totalRow(int[][] array) {
        int[] total = new int[4];
        for (int ro = 0; ro < array.length; ro++) {
            for (int col = 0; col < array[ro].length; col++) {
                total[ro] += array[ro][col];
            }
        }
        return total;
    }

    public static int[] totalCol(int[][] array) {
        int[] total = new int[4];
        for (int col = 0; col < array[0].length; col++) {
            for (int row = 0; row < array.length; row++) {
                total[col] += array[row][col];
            }
        }
        return total;


    }

    public static int largestRow(int[] totalRow) {
        int max = totalRow[0];
        int index = 0;
        for (int row = 1; row < totalRow.length; row++) {
            if (max < totalRow[row]) {
                max = totalRow[row];
                index = row;
            }
        }
        return index;
    }

    public static int largestCol(int[] totalCol) {
        int max = totalCol[0];
        int index = 0;
        for (int row = 1; row < totalCol.length; row++) {
            if (max < totalCol[row]) {
                max = totalCol[row];
                index = row;
            }
        }
        return index;

    }


}
