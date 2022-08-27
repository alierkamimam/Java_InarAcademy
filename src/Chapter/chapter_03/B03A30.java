package Chapter.chapter_03;
import java.util.Scanner;
public class B03A30 {
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	
			
		long totalMilliseconds = System.currentTimeMillis();
			
		long totalSeconds = totalMilliseconds/1000;
		
		long currentSecond = totalSeconds%60;
		
		long totalMinutes = totalSeconds/60;
		
		long currentMinute = totalMinutes%60;
		
		long totalHours = totalMinutes/60;
		
		long currentHour = totalHours%24;
		
		System.out.print("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		currentHour+=offset;
		
		if (0<currentHour && currentHour<13)
			System.out.print("The current time is : " + currentHour+":"+currentMinute+":"+currentSecond +"AM");
		
		
		
		else if(currentHour<0)
			currentHour+=24;
		
		     if(currentHour>13){
			 currentHour-=12;
			 System.out.print("The current time is : " + currentHour+":"+currentMinute+":"+currentSecond +"PM");
		     }
}
		

}
