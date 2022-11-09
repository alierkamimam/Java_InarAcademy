package chapter.chapter10.checkpoint;

public class cp15 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s3));

        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace('o','T'));
        System.out.println(s1.toCharArray());
        char[] a=s1.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");


        }
    }

}
