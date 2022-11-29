package chapter.chapter13.lisitng;

public class SortRectangles {
    public static void main(String[] args) {
        Comperablerectangle[] rectangles= {new Comperablerectangle(3.4, 5.4),
                new Comperablerectangle(13.24, 55.4), new Comperablerectangle(7.4, 35.4),
                new Comperablerectangle(1.4, 35.4)};

        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle:rectangles
             ) {
            System.out.print(rectangle+" ");

        }
        System.out.println();
    }
}
