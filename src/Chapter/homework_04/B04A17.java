package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A17 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		
		System.out.print("Enter a month as (Jan): ");
		String month = input.next();
		
		
		boolean leapYear = 
				((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		
			if (month.equals("Jan") || month.equals("Mar")|| month.equals("May")||
					month.equals("Jul")|| month.equals("Aug") || month.equals("Oct")
					|| month.equals("Dec")) {
				System.out.println(month + " " +year +" " +31+ " days");
			}
			else if(month.equals("Apr") || month.equals("Jun") || 
					month.equals("Sep") || month.equals("Nov")){
				System.out.println(month + " " +year +" "+30 + " days");
				
			}else
				System.out.println(month + " " +year +" "+((leapYear) ? 29 : 28) + " days");	}
}