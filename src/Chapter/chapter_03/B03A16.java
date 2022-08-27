package Chapter.chapter_03;
import java.util.Scanner;

public class B03A16 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter  x  y points number: ");
		 int x = (int)(Math.random() *100)-50;
		 int y = (int)(Math.random() *200)-100;
		 System.out.print(x+"x" + " "); 
		 System.out.println(y+"y");
		
		 
		 if (-50< x && x<50 && -100<y && y<100)
			 System.out.println("Your points is in  rectangle  ");
		 
		 else
			 System.out.println("Your points is not in  rectangle");
	}

}
