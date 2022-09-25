package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A11 {
	
		public static void main(String[] args) {
			System.out.println(" Enter a decimal value (0 to 15)");
			Scanner input= new Scanner(System.in);
			
			int num= input.nextInt();
			
			if (!(num>=0 && num<=15)){
				System.out.println("invalid value\n"+"Please enter a decimal value (0 to 15)");
				System.exit(1);
			}
			else if (num>=0 && num<=9) {
				System.out.println("The hex value is: "	+num);
			}
			else if(num>=10){
				char b = (char)('A'-10+num );
				System.out.println("The hex value is: " +b);
			}
				
				
			
		}

}
