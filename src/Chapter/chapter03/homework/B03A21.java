package Chapter.chapter_03;
import java.util.Scanner;


public class B03A21 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year e.g (2012): ");
		int years = input.nextInt();
		
		System.out.println("Enter a month 1-12");
		int m = input.nextInt();
		if (m==1) {
			m=13;
			years--;}
		
		if (m==2) {
			m=14;
			years--;
		}
		
		
		System.out.println("Enter a day of the month 1-31 : ");
		int q = input.nextInt();
		
		int j = years / 100;
		int k = years % 100;
		
		
		int h = (q+ ((26*(m+1))/10) + k+(k/4)+(j/4)+(5*j))%7;
		
		
		switch(h) {
		case 0:System.out.println("Day of the week is Sunday");break;
		case 1:System.out.println("Day of the week is Monday");break;
		case 2:System.out.println("Day of the week is Tuesday");break;
		case 3:System.out.println("Day of the week is Wednesday");break;
		case 4:System.out.println("Day of the week is Thursday");break;
		case 5:System.out.println("Day of the week is Friday");break;
		case 6:System.out.println("Day of the week is Saturday");
		}
		
		
		
	}
	
		
	

}
