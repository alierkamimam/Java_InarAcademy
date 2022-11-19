package chapter.chapter10.homework.Exercises27;

public class MyStringBuilder {
    private String s;


    public MyStringBuilder(String s) {
        this.s = s;
    }

    public MyStringBuilder append(MyStringBuilder s) {
        this.s = this.s + s.toString();
        return this;

    }

    public MyStringBuilder append(int i) {
        this.s = this.s + i;
        return this;
    }

    public int length() {
        return this.s.length();
    }

    public String toString() {
        return this.s;
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder toLowerCase() {
        this.s = this.s.toLowerCase();
        return this;
    }

    public MyStringBuilder substring(int begin, int end) {
        this.s = this.s.substring(begin, end);
        return this;

    }
}