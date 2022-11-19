package chapter.chapter10.homework.Exercises27;

public class exercises27 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder=new MyStringBuilder("Erkam");
        MyStringBuilder myStringBuilder1=new MyStringBuilder("Imam");
        System.out.println(myStringBuilder.toString());
        System.out.println(myStringBuilder1.toString());


        myStringBuilder.append(myStringBuilder1);
        System.out.println(myStringBuilder);
        System.out.println(myStringBuilder1);
        myStringBuilder.substring(1,2);
        System.out.println(myStringBuilder);
        myStringBuilder.append(3339);
        System.out.println(myStringBuilder);
        System.out.println(myStringBuilder.length());
        System.out.println(myStringBuilder.charAt(3));


    }
}
