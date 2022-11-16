package chapter.chapter10.homework.Exercises24;

public class MyCharacter {
    public static final char MIN_VALUE = '\u0000';
    public static final char MAX_VALUE = (char) (MIN_VALUE - 1);

    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public static char getValueOf(MyCharacter ch) {
        return ch.getChar();
    }

    private char getChar() {
        return this.ch;
    }

    public boolean compareTo(MyCharacter ch) {
        return this.ch == ch.getChar();
    }

    public void toLowerCase() {
        this.ch = Character.toLowerCase(this.ch);

    }

    public void toUpperCase() {
        this.ch = Character.toUpperCase(this.ch);
    }

    public boolean isLetter() {
        return (this.ch >= 'a' && this.ch <= 'z') || (this.ch >= 'A' && this.ch <= 'Z');
    }

    public boolean isDigit() {
        return (this.ch >= '0' && this.ch <= '9');
    }

    public boolean isDigitOrLetter() {
        return this.isDigit() || this.isLetter();

    }


}
