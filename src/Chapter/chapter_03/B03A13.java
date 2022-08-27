package Chapter.chapter_03;
import java.util.Scanner;
public class B03A13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("(0-single filer, 1-married jointly or " +
				 "qualifying widow(er), 2-married separately, 3-head of " +
				 "household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		 double income = input.nextDouble();
		 
		 double tax = 0;
		 
		 
		 
		 if (status == 0) { // Compute tax for single filers
			 if (income <= 8350)
			  tax = income * 0.10;
			  else if (income <= 33950)
			  tax = 8350 * 0.10 + (income - 8350) * 0.15;
			  else if (income <= 82250)
			  tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
			  (income - 33950) * 0.25;
			  else if (income <= 171550)
			  tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
			  (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			  else if (income <= 372950)
				   tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				  (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				   (income - 171550) * 0.33;
		         
		      else 
				   tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				   (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				   (372950 - 171550) * 0.33 + (income - 372950) * 0.35 ;
			 
		 }
		
		 else if (status ==1) {
			 if (income <= 16.700)
				  tax = income * 0.10;
				  else if (income <= 67.900)
				  tax =  16.700* 0.10 + (income - 16.700) * 0.15;
				  else if (income <= 137.050)
				  tax = 8350 * 0.10 + (67.900 - 16.700) * 0.15 +
				  (income - 67.900) * 0.25;
				  else if (income <= 208.850)
				  tax = 16.700 * 0.10 + (67.900 - 16.700) * 0.15 +
				  (137.050 - 67.900) * 0.25 + (income - 137.050) * 0.28;
				  else if (income <= 372950)
					   tax = 16.700 * 0.10 + (67.900 - 16.700) * 0.15 +
					  (137.050 - 67.900) * 0.25 + (208.850 - 137.050) * 0.28 +
					   (income - 208.850) * 0.33;
			         
			      else 
					   tax = 16.700 * 0.10 + (67.900 - 16.700) * 0.15 +
					   (137.050 - 67.900) * 0.25 + (208.850 - 137.050) * 0.28 +
					   (372950 - 208.850) * 0.33 + (income - 372950) * 0.35 ;
		 }
			 	
		 else if (status == 2) {
			 if (income<=8.350)
				tax = income * 0.10;
			    else if (income <= 33.950)
			 	tax =  8.350 * 0.10 + (33.950 - 8.351) * 0.15;
			 	else if (income <= 68.525)
			    tax =  8.350 * 0.10 + (33.950 - 8.351) * 0.15 +
			    (income-33.950)*0.25 ;
			 	else if(income<=104.425)
			 	tax =  8.350 * 0.10 + (33.950 - 8.351) * 0.15 +
					    (68.525 -33.950)*0.25 +  (income-68.525);
			 	else if(income<=186.475)
			 		tax =  8.350 * 0.10 + (33.950 - 8.351) * 0.15 +
				    (68.525 -33.950)*0.25 +  (104.425-68.525) +
				   ( income-104.425) * 0.33;
			 	else
			 		
			 		tax =  8.350 * 0.10 + (33.950 - 8.351) * 0.15 +
				    (68.525 -33.950)*0.25 +  (104.425-68.525) +
				   ( 186.475-104.425) * 0.33 + (income-186.475)* 0.35  ;
			 	
			 	
			 		
			 System.out.println("Tax is " + (int)(tax * 100) / 100.0);
			 
			 
			 
			 
			 
			 
			 
		 }

			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
