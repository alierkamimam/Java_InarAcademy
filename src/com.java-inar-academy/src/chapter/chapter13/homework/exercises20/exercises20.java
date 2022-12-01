package chapter.chapter13.homework.exercises20;

import chapter.chapter13.homework.exercises17.Complex;

import java.util.Scanner;

public class exercises20 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b and c.
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        double discriminant = Math.pow(b, 2) - 4 * a * c;


        if (discriminant > 0)
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %2.6f and  %1.6f " , root1 , root2);
        }
        else if (discriminant == 0)
        {
            System.out.println("The root is " +
                    (-b + Math.sqrt(discriminant)) / (2 * a));
        }
        else { // Display imaginary roots by using two Complex objects.
            System.out.print("The roots are ");
            Complex root1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex root2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.printf("%2.6f and %2.6f",root1 , root2);
        }
    }

}
