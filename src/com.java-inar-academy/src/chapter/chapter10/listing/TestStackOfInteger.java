package chapter.chapter10.listing;

public class TestStackOfInteger {
    public static void main(String[] args) {
        StackOfInteger stackOfInteger=new StackOfInteger();

        for (int i = 0; i < 10; i++)
            stackOfInteger.push(i);
        System.out.println(stackOfInteger.peek());
        System.out.println("--");

        while (!stackOfInteger.empty()){
            System.out.print(stackOfInteger.pop()+" ");

        }


    }
}
