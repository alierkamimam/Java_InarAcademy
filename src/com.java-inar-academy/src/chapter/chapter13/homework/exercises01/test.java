package chapter.chapter13.homework.exercises01;

public class test {
    public static void main(String[] args) {
        GeometricObject triangle=new Triangle();
        System.out.println(triangle.toString());
        System.out.println("------------------");
        GeometricObject triangle1=new Triangle("Black",true,7,24,25);
        System.out.println(triangle1.toString());
    }
}
