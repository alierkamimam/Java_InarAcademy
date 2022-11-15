package chapter.chapter11.checkpoint;

public class Test {
    public static void main(String[] args) {
        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        int[] list3 = {1, 2, 3};
        printArray(list1);
        printArray(list2);
        //printArray(list3); because of  primitive type , compiler don't compile.
         }

         public static void printArray(Object[] list) {
             for (int i = 0; i < list.length; i++) {
                 Object o = list[i];
                 System.out.print(o + " ");
             }
              System.out.println();
    }
}
