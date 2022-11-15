package chapter.chapter11.checkpoint;

public class cp22 {
    public static void main(String[] args) {
        A a=new A(3);


    }
}
class A extends F{
    public A(int t){
        //hidden super();
        System.out.println("A's constructor is invoked");
    }
}




class F{
    public F(){

        System.out.println("B's constructor is invoked");
    }
}
