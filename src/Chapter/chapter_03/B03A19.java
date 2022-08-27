package Chapter.chapter_03;
import java.util.Scanner;
public class B03A19 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int perimeter=0;

		 System.out.println(" Enter three value for each side of triangle");
		 int side1 =input.nextInt();
		 int side2=input.nextInt();
		 int side3=input.nextInt();
		 
		 if (   (side1+side2) >side3 
			 && (side1+side3) > side2
		     && (side2+side3) >side1) {
			 perimeter =side1+side2+side3;
		 	System.out.println("Perimeter of triangle is " + perimeter);
		 }else 
		 		System.out.println("ıt is not triangle");
		 		
		 
		 
		 
		 
		 
		 
	}

}
