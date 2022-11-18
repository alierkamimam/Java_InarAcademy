package chapter.chapter11.homework.ex10;

public class test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(21);
        myStack.push(311);
        myStack.push(1471);
        myStack.push(11412);
        myStack.push(161111);
        myStack.push(1111812);
        System.out.println(myStack.peek());
       myStack.pop();
        display(myStack);
    }

    public static void display(MyStack stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
