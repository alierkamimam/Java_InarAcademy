package Chapter.chapter_03;
import java.util.Scanner;
public class B03A11 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter a mounth number : ");
		 int mounth = input.nextInt();
		 
		 System.out.print("Enter a year : ");
		 int years = input.nextInt();
		 
		 switch(mounth) {
		     case 1:System.out.println("jan " + years + " is 31 dasys");break;
		     case 2:System.out.println("Feb " + years + " is 29 dasys");break;
		     case 3:System.out.println("March " + years + " is 31 dasys");break;
		     case 4:System.out.println("Apr " + years + " is 30 dasys");break;
		     case 5:System.out.println("May " + years + " is 31 dasys");break;
		     case 6:System.out.println("june " + years + " is 30 dasys");break;
		     case 7:System.out.println("july " + years + " is 31 dasys");break;
		     case 8:System.out.println("Aug " + years + " is 31dasys");break;
		     case 9:System.out.println("Sep " + years + " is 30 dasys");break;
		     case 10:System.out.println("Oct " + years + " is 31 dasys");break;
		     case 11: System.out.println("Now " + years + " is 30 dasys");break;
		     case 12:System.out.println("Dec " + years + " is 31 dasys");break;
		     default :
		 		System.out.println("Wrong mounth");
		 
		 
		 }
		 
	 }
}
