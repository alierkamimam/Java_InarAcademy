package Chapter.chapter_03;
import java.util.Scanner;
public class B03A23 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a point with two cordinates: ");
		 double x = input.nextInt();
		 double y = input.nextInt();
		 
		 
		 if ( -5.5 <x && x<5.5
			&& -2.5<y && y<2.5) {
				System.out.println("Point("+x+ " "+ y +")is in rectangle " );
		 }else
			System.out.println("Point("+x+ " "+ y +")is not  in rectangle " );
					
		 }
		 
		 
		 
	
}
