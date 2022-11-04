package chapter.chapter09.listing;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields mycircle=new CircleWithPrivateDataFields(1);
        int n=5;
        printAreas(mycircle,n);

        System.out.println("\n"+"Radius is "+mycircle.getRadius());
        System.out.println("n is "+n);


    }
    public static void printAreas(CircleWithPrivateDataFields c,int n){
        System.out.println("Radius\t\tArea");
        while (n>=1){
            System.out.println(c.getRadius()+"\t\t"+ c.getArea());
            c.setRadius(c.getRadius()+1);
            n--;
        }

    }

}
