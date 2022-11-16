package chapter.chapter10.homework.Exercises22;

public class Test {
    public static void main(String[] args) {
        char[] array={'E','R','K','A','M'};

        MyString s1=new MyString(array);
        System.out.println(s1.toString());

        MyString s2=s1.toLowerCase();
        System.out.println(s2.toString());

        MyString s3=s1.substring(2,4);
        System.out.println(s3);

        System.out.println(s3.lenght());
        System.out.println(s3.charAt(1));

        System.out.println(s1.equals(s2));


        MyString s4=MyString.valueOf(87765);
        System.out.println(s4.toString());



    }
}
