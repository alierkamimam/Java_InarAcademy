package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises25 {
    public static void main(String[] args) {
        double[] eqn = getEqn();

        if (solveDiscriminant(eqn)>0){
            System.out.println("Two roots");
            System.out.println("The Root1 is "+getRoot1(eqn)+" Root2 is "+ getRoot2(eqn));
        } else if (solveDiscriminant(eqn)==0) {
            System.out.println("One root");
            System.out.println("The root is "+getRoot1(eqn));

        }else
            System.out.println("Has no real root");


    }

    public static double[] getEqn() {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        System.out.println("Enter values a , b and c:");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextInt();
        }
        return eqn;
    }

    public static double solveDiscriminant(double[] eqn) {
        // Math.pow(b , 2) - (4 * a * c );
        return Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
    }

    public static double getRoot1(double[] eqn) {
        //double root1 =(-b + Math.sqrt(discriminant)) / (2 * a);
        return (-eqn[1] + Math.sqrt(solveDiscriminant(eqn))) / (2 * eqn[0]);
    }

    public static double getRoot2(double[] eqn) {
        //double root2 =(-b - Math.sqrt(discriminant)) / ( 2* a);
        return (-eqn[1] - Math.sqrt(solveDiscriminant(eqn))) / (2 * eqn[0]);
    }
}
