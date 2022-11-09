package chapter.chapter10.exercises;

public class _02 {
    public static void main(String[] args) {

        String[] tokens = "Java#Html#Perl".trim().split("#");
        int count1 = tokens.length;
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i] + "");
        }
        System.out.println(count1);
        System.out.println("Java is fun".matches("Java......."));
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));

        String s = "a+b$#c".replaceAll("[$#+]", "NNN");
        System.out.println(s);

        String[] tokens1 = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens1.length; i++) {
            System.out.println(tokens1[i] + "");
            System.out.println();


            char[] chars = "Java".toCharArray();


            char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
            "CS3720".getChars(2, 6, dst, 4);
            for (int j = 0; j < dst.length; j++) {
                System.out.print(dst[j]+"  ");
            }


        }
    }
}
