package Chapter.chapter_03;

import java.util.Scanner;

public class B03A33 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		
		double weight1 = sc.nextDouble();
		double price1 = sc.nextDouble();
		
		double package1 = price1/weight1;
	
		System.out.print("Enter weight and price for package 2: ");
		
		double weight2 = sc.nextDouble();
		double price2 = sc.nextDouble();
		
		double package2 = price2/weight2;
		
		if(package1>package2)
			System.out.println("Package 1 has a better price.");
		
		else if(package1<package2)
			System.out.println("Package 2 has a better price.");
		
		else
			System.out.println("Two packages have the same price.");

}
}