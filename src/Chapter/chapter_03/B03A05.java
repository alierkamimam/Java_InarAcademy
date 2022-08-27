package Chapter.chapter_03;
import java.util.Scanner;

public class B03A05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int days = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		int todays = (days + elapsed)% 7;
		
		
		switch(days) {
		case 0:System.out.print("Today is Sunday");break;
		case 1:System.out.print("Today is Monday");break;
		case 2:System.out.print("Today is Tuesday");break;
		case 3:System.out.print("Today is Wednesday");break;
		case 4:System.out.print("Today is Thursday");break;
		case 5:System.out.print("Today is Friday");break;
		case 6:System.out.print("Today is Saturday");
		default :
			System.out.println("wrong number");
			     break;
			   
		}
		
		switch(todays) {
		case 0 :System.out.println(" The future day is Sunday" );break;
		case 1 :System.out.println(" The future day is Monday");break;
		case 2 :System.out.println(" The future day is Tuesday");break;
		case 3 :System.out.println(" The future day is Wednesday");break;
		case 4 :System.out.println(" The future day is Thursday");break;
		case 5 :System.out.println(" The future day is Friday");break;
		case 6 :System.out.println(" The future day is Saturday");
		default:
			System.out.println("wrong number");
		          break;
		}
	}

}
