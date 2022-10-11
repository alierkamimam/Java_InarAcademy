package chapter.chapter07.listing;

public class listing06 {
    public static void main(String[] args) {
        int[] list ={1,4,4,2,5,-3,6,2};
        System.out.println( linearSortin(list,4));
        System.out.println( linearSortin(list,2));
        System.out.println( linearSortin(list,-3));
        System.out.println( linearSortin(list,6));
        System.out.println( linearSortin(list,8));
    }

    public static int linearSortin(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }

        return -1;
    }
}




