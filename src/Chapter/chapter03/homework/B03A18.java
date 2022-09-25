package Chapter.chapter_03;
import java.util.Scanner;
public class B03A18 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 
		 System.out.println("enter the weight of the package");
		 int weight= input.nextInt();
		 
		 if (0<weight && weight<=1)
			 System.out.println("price is  $3,5 " );
		 else if(1<weight && weight<=3)
			 System.out.println("price is  $5,5 ");
		 else if(3<weight && weight<=10)
			 System.out.println("price is  $8,5 ");
		 else if(10<weight && weight<=20)
			 System.out.println("price is  $5,5 ");
		 else if (weight>50)
		 	System.out.println("“The package cannot be shippe");
	}
			 
		 
		 

}
