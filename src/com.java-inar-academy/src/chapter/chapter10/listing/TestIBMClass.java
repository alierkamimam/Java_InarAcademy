package chapter.chapter10.listing;

public class TestIBMClass {
    public static void main(String[] args) {
        BMI bmi=new BMI("Kim Yang",18,145,70);
        System.out.println("The BMI for  "+bmi.getName()+" is "+bmi.getIBM()+" "+bmi.getStatus());


        BMI bmi1=new BMI("Susan King",215,70);
        System.out.println("The BMI for  "+bmi1.getName()+" is "+bmi1.getIBM()+" "+bmi1.getStatus());
    }
}
