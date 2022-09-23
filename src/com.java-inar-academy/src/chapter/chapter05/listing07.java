package chapter.chapter05;

public class listing07 {
    public static void main(String[] args) {
        System.out.println("          multiplication table");


        System.out.print("    ");

        for (int a = 1; a<=9;a++)
            System.out.print("   "+a);
        System.out.println("\n---------------------------------------");



        for (int i=1;i<10;i++) {
            System.out.print(i+" | ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
