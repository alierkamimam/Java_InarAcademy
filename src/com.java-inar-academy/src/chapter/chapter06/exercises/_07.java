package chapter.chapter06.exercises;

public class _07 {                              //generating random characters
    public static void main(String[] args) {
        //System.out.println((int)'z');
       // int random=(int) (Math.random()*((int)'z'-(int) 'a'+1)+(int)'a');
      //  System.out.println((char) random);

        char c = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println(c);


    }
}
