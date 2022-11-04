package chapter.chapter09.exercises;

public class F {
    private int x=0;
    private int y=0;

    public F(){


    }
    public void p(){

        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    public static void main(String[] args) {
        F f=new F();
        f.p();
    }
}
