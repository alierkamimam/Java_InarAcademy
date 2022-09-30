package chapter.chapter06.homework;

public class exercises12 {
    public static void main(String[] args) {

        final int NUMBERPERLINE = 10;
        char ch1 = '1';
        char ch2 = 'Z';
        printsChars(ch1, ch2, NUMBERPERLINE);

    }

    public static void printsChars(char ch1, char ch2, int numberPerline) {
        int count = 1;
        for (int i = ch1; i <= ch2; i++) {
            if (count % numberPerline == 0) {
                System.out.println((char) i);
            } else
                System.out.print((char) i+" ");
            count++;


        }

    }
}
