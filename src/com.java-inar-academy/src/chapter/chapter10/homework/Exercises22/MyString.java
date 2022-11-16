package chapter.chapter10.homework.Exercises22;

public class MyString {
    char[] chars;

    MyString(char[] chars) {
        this.chars = chars;
    }

    public int lenght() {
        return chars.length;
    }

    public char charAt(int index) {
        return chars[index];

    }

    public MyString substring(int begin, int end) {
        if (begin < 0 || begin > lenght() || end < 0 || end > lenght() || begin > end) {
            System.out.println("Invalid substring parameters");
            System.exit(-1);
        }
        char[] newArray = new char[end - begin];
        for (int newindex = 0, oldindex = begin; newindex < newArray.length; newindex++, oldindex++) {
            newArray[newindex] = charAt(oldindex);

        }
        return new MyString(newArray);
    }

    public MyString toLowerCase() {
        char[] ch = new char[lenght()];

        for (int i = 0; i < lenght(); i++) {
            if (chars[i] < 'Z' && chars[i] > 'A') {
                ch[i] = (char) (charAt(i) + ('a' - 'A'));//a:97,A:65 (a-A=32)
            }
        }
        return new MyString(ch);


    }

    public boolean equals(MyString s) {
        if (lenght() != s.lenght()) {
            return false;
        }
        for (int i = 0; i < lenght(); i++) {
            if (charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;

    }

    public static MyString valueOf(int i) {
        int counter = 0;
        int number = i;

        while (number > 0) {
            number /= 10;
            counter++;
        }

        char[] ch = new char[counter];

        for (int j = counter - 1; j >= 0; j--) {
            ch[j] = (char) ('0' + i % 10);
            i/=10;

        }
        return new MyString(ch);


    }
    public String toString(){
        String s=new String(chars);
        return s;
    }


}

