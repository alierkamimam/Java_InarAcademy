package Chapter.chapter_05.homework_05;

public class exercises05 {
public static void main(String[] args) {
	
	System.out.println("Kilograms   Pounds | Pounds   Kilograms");
	
	for(int i=1,p=20;i<200 && p<516;i+=2,p+=5) {
		System.out.printf("\n%-9d%7.1f   | %-3d%15.2f",i,(i*2.2),p,(p/2.2) );
	
	}
}
}
