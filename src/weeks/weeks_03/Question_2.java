package weeks.weeks_03;
import java.util.Scanner;
public class Question_2 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter three year : ");
		  int max;
		  int years1= input.nextInt();
		  int years2= input.nextInt();
		  int years3= input.nextInt();
		 
		  if ( years1 > years2 && years2 > years3) {
			  System.out.println(years3+" " +years2+" "+years1);
			  
		  }else if(years1>years2 && years1>years3 && years3>years2) {
			  System.out.println(years2+" " +years3+" "+years1);
			  
		  }else if(years2>years3 && years2>years1 && years1>years3) {
			  System.out.println(years3+" " +years1+" "+years2);
			  
		  }else if (years3>years1 && years3>years2 && years1>years2) {
			  System.out.println(years2+" " +years1+" "+years3);
			  
		  }else if (years3>years2 && years2>years1 ) {
			  System.out.println(years1+" " +years2+" "+years3);
		  }else if(years2>years1 && years2>years3 && years3>years1) {
			  System.out.println(years1+" " +years3+" "+years2);
		  }
		  
		
			 
		 
	}

}
