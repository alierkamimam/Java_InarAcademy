package chapter.chapter10.exercises;

public class _03 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        String s = String.valueOf(stringBuilder);
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "");

        }
        System.out.println();
        stringBuilder.setLength(45);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());

        System.out.println("---------------------------");
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(8, 11));
        System.out.println(stringBuilder.deleteCharAt(8));
        System.out.println(stringBuilder.reverse());


    }
}
