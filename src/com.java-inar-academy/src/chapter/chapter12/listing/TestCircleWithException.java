package chapter.chapter12.listing;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException circle=new CircleWithException(5);
           /* CircleWithException circle1=new CircleWithException(-5);*/
            CircleWithException circle2=new CircleWithException(0);

        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of objects created "+CircleWithException.getNumberOfObjects());
    }
}
