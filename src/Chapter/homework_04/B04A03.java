package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A03 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a point's x- and y-coordinates: ");
		 double x1= input.nextDouble();
		 double y1 = input.nextDouble();
		
		 double x=1;
		 double y=1;
		 
		//x +2*y -200=0;
		 double formule = x1 + 2*y1 -200;
		 if (formule <= 0) {
			 System.out.println("The point is in the triangle");
			 
		
		 }else if (formule >=0) {
			 System.out.println("The point is not in the triangle");
		 }
		 

}
}