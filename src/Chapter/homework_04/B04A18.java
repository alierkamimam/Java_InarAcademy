package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A18 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("M: Mathematics\r\n"
				+ "C: Computer Science\r\n"
				+ "I: Information Technology");
		System.out.println("-------------------------");
		System.out.println("1:freshman\r\n"
				+ 		 "2:sophomore\r\n"
				+        "3:junior\r\n"
				+        "4:senior\r\n");
		System.out.println("Enter two characters:");
		String major = input.next();
		char ch = major.charAt(0);
		char ch1=major.charAt(1);
		
		
		switch(ch) {
		case 'M':System.out.print("Mathematics");break;
		case 'C':System.out.print("Computer Science ");break;
		case 'I':System.out.print(" Information Technology");break;
		}
		
		
		switch(ch1) {
		case '1':System.out.println("  Freshman");break;
		case '2':System.out.println("  Sophomore");break;
		case '3':System.out.println("  Junior");break;
		case '4':System.out.println("  Senior");break;
		}

}
}