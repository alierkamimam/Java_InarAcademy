package Chapter.chapter_05.homework_05;

public class exercises19 {
	public static void main(String[] args) {
		
		int row=7;
		
		for(int i= 0;i<=row;i++) {
			
			
			for(int j=0;j<row-i;j++) { 
				System.out.print("    ");
			}	
				

			for(int k=0;k<=i;k++) {
				int x=(int) Math.pow(2, k);
				
				System.out.printf("%4d" , x);
				
				
			}
			
			for(int b=i-1;b>=row-7;b--) {
				
				System.out.printf("%4d",(int) Math.pow(2, b));
			
		}
			
			System.out.println(" ");
		}
	

}}
