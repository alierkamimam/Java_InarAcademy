package chapter.chapter10.homework.Exercises24;

public class Test {
    public static void main(String[] args) {
        MyCharacter myCharacter=new MyCharacter('A');
        System.out.println(myCharacter.isDigit());
        System.out.println(myCharacter.isLetter());
        System.out.println(myCharacter.isDigitOrLetter());
        myCharacter.toLowerCase();
        System.out.println(MyCharacter.getValueOf(myCharacter));
        myCharacter.toUpperCase();
        System.out.println(MyCharacter.getValueOf(myCharacter));
        System.out.println(myCharacter.compareTo(new MyCharacter('A')));

        ;
    }
}
