package chapter.chapter11.listing;

public class test {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(11);
        stack.push(24);
        stack.push(45);
        System.out.println(stack.toString());
        System.out.println( stack.peek());
        stack.pop();
        System.out.println(stack.toString());


    }
}
