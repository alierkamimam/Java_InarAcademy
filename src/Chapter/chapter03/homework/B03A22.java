package Chapter.chapter_03;
import java.util.Scanner;
public class B03A22 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		System.out.println(" Enter  x y points :"); 
		double x = input.nextInt();
		double y = input.nextInt();
		
		
		double formule =  Math.pow(Math.pow((x-0),2 )+ Math.pow(y-0, 2), 0.5);
		
		if(formule <= 10)
			System.out.println("Point("+x+ " "+ y +")is in circle" );
	
		else
			System.out.println("Point("+x+ " "+ y +")is  not in circle" );
		
	}}
