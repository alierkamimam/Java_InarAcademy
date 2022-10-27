package chapter.chapter08.homework;

public class exercises27 {
    public static void main(String[] args) {
        double[][] array = exercises26.getFromUser();
        System.out.println("Before sorting");
        exercises26.print(array);
        System.out.println("\n");
        System.out.println("After sorting");
        double[][] sortedArray = sortCol(array);
        exercises26.print(sortedArray);

    }
    public static double[][] sortCol(double[][] array) {
        for (int col = 0; col < array.length; col++) {
            for (int row = 0; row < array[row].length - 1; row++) {

                double min = array[row][col];
                int minIndex = row;

                for (int j = row + 1; j < array.length; j++) {
                    if (min > array[j][col]) {
                        min = array[j][col];
                        minIndex = j;

                    }
                }
                if (minIndex != row) {
                    array[minIndex][col] = array[row][col];
                    array[row][col] = min;
                }
            }
        }
        return array;
    }

}
