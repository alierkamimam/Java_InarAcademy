package chapter.chapter08.homework;

public class exercises29 {
    public static void main(String[] args) {
        System.out.println("Enter list1:");
        int[][] list1 = exercises28.getFromUser();
        System.out.println("Enter list2");
        int[][] list2 = exercises28.getFromUser();
        System.out.println("The two arrays are" + (equals(list1, list2) ? "" : " not") + " identical");

    }

    public static boolean equals(int[][] list1, int[][] list2) {
        if (list2.length != list1.length) {
            return false;
        }
        int[] ls1 = sort(list1);
        int[] ls2 = sort(list2);

        for (int row = 0; row < ls1.length; row++) {
            if (ls1[row] != ls2[row])
                return false;
        }
        return true;
    }


    public static int[] sort(int[][] list) {
        int[] array = matrixToArray(list);

        for (int row = 0; row < array.length - 1; row++) {
            int min = array[row];
            int index = row;

            for (int column = row + 1; column < array.length; column++) {
                if (min > array[column]) {
                    min = array[column];
                    index = column;
                }
            }
            if (index != row) {
                array[index] = array[row];
                array[row] = min;
            }

        }
        return array;

    }


    public static int[] matrixToArray(int[][] m) {
        int[] list = new int[m.length * m[0].length];
        int k = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                list[k] = m[row][column];
                k++;
            }
        }
        return list;
    }

}


