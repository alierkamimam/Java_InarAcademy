package chapter.chapter08.execises;

public class atmPassword {
    public static void main(String[] args) {
        System.out.println("Dear thieves, please don't steal my ATM card");
        System.out.println("But if you do , here' my password");
        firstpart();
        lastbit();
        secondpart();
        System.out.println("");
    }

    public static void firstpart() {
        System.out.print("1");
    }

    public static void secondpart() {
        System.out.print("8");
        firstpart();
        lastbit();
         lucky();
         lastbit();
    }
    public static void lucky(){
        System.out.print("7");

    }
    public static void lastbit(){
        System.out.print("3");
        lucky();
        System.out.print("4");
    }
}
