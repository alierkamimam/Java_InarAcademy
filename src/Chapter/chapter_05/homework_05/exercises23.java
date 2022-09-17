package Chapter.chapter_05.homework_05;

public class exercises23 {
	public static void main(String[] args) {
		
		
		double n =5000;
		double sum =0;
		double sum1=0;
		
		
		
		for(double a=1;a<=n;a++) {
			sum1=sum1+(1/n);
			
		}
		
		for(double i=1;i<=n;n--) {
			sum=sum+(1/n);
			
		
		}
		System.out.println("left to right "+sum);
		System.out.println("right to left "+sum1);
		
	
	}

}
