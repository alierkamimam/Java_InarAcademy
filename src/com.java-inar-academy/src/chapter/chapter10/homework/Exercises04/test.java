package chapter.chapter10.homework.Exercises04;

public class test {
    public static void main(String[] args) {
        Mypoint mypoint=new Mypoint(3,3);
        Mypoint mypoint1=new Mypoint(1,1);
        System.out.println("Distance between ("+mypoint.getX()+","+mypoint.getY()+") to ("+mypoint1.getX()+","+mypoint1.getY()+")");
        System.out.println( mypoint.distance(mypoint1));
    }
}
