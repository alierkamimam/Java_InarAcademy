package chapter.chapter10.homework.Exercises02;

public class Test {
    public static void main(String[] args) {
        BMI Erkam=new BMI("Erkam",25,83,180);
        System.out.println(Erkam.getBMI());
        System.out.println(Erkam.getStatus());

        BMI erkam1=new BMI("erkam",25,83,5,10);
        System.out.println(erkam1.getBMI());
        System.out.println(erkam1.getStatus());



        BMI kim=new BMI("Kim Jhon",34,67,155);
        System.out.println("The Ibm for "+kim.getName()+" is "+kim.getBMI()+" "+kim.getStatus());
    }
}
