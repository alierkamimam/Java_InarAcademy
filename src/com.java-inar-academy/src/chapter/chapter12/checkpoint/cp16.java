package chapter.chapter12.checkpoint;

public class cp16 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
            System.out.println(ex.getStackTrace());
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    static void method() throws Exception {
        String s = "abc";
        System.out.println(s.charAt(3));
      /*  try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
        }*/
    }
}
