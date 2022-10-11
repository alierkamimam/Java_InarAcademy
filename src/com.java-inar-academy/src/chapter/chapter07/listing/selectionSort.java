package chapter.chapter07.listing;

public class selectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);

    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            double cuurentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (cuurentMin > list[j]) {
                    cuurentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = cuurentMin;
            }

        }
    }
}
