package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A08 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int GMT = input.nextInt();
		
		long totalMilisecond = System.currentTimeMillis();
		
		long totalseconds = totalMilisecond / 1000;
		
		long currentseconds =totalseconds%60;
		
	    long totalminutes = totalseconds /60 ;
	    
	    long currentminute= totalminutes %60;
	    
	    long totalhours= totalminutes /60;
	    
	    long currentshours = totalhours %24 ;
	    currentshours=currentshours+GMT;
	    
	    System.out.println("Current time is"  + currentshours + ":" + currentminute+":" +
	    		currentseconds +"" );
	    
	    
		
		
		
		
		
		
	}

}
