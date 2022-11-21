package chapter.chapter12.checkpoint;

public class cp20 {
    public static void main(String[] args) throws Exception {
      try {
          m(50);

      }catch (Exception a){
          System.out.println("Value is too small");
      }finally {
          System.out.println("erkam");
      }
        System.out.println("imam");



    }
    public  static  void m(int value)  throws Exception{
        if (value<40){
            throw new Exception("value is too small");
        }
    }
}
