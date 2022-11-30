package chapter.chapter13.homework.exercises08;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {


        MyStack myStack = new MyStack();

        System.out.println("Pushing three numbers");
        myStack.push(4);
        myStack.push(5);
        myStack.push(9);


        System.out.println("Cloning stack1 to stack2");
        MyStack myStack2 = (MyStack) myStack.clone();


        System.out.println("Popping object from 1st stack...");
        myStack.pop();


        System.out.print("1st ");
        System.out.println(myStack);
        System.out.print("2nd ");
        System.out.println(myStack2);
        System.out.println("Is the 1st stack equal to the 2nd? " +
                (myStack == myStack2));


    }
}