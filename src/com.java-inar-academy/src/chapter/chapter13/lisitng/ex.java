package chapter.chapter13.lisitng;

public class ex {
    public static void main(String[] args) {
        System.out.println(new Integer(3).compareTo(new Integer(5)));
        System.out.println("ABC".compareTo("ABE"));
        java.util.Date date1 = new java.util.Date(2013, 1, 1);
        java.util.Date date2 = new java.util.Date(2012, 1, 1);
        System.out.println(date1.compareTo(date2));
    }
}
