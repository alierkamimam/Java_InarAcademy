package Chapter.Chapter_02;
import java.util.Scanner ;

public class B02A01 {
	public static void main(String[] args) {
	
	  System.out.println("Enter a degree in Celcius:");
      Scanner input = new Scanner(System.in);
    
    	double celcius= input.nextDouble();
    	double fahrenheit = (9.0/5) * celcius +32 ;
    	
    	System.out.println(celcius + " Celcius is "+ fahrenheit +  " Fahrenheit ");
    	
    	
    }
    
	}
	


