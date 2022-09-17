package Chapter.chapter_05.homework_05;

public class exercises27 {
	public static void main(String[] args) {
		
		final int TEN_PER_LİNE=10;
	
		String years = "";
		
		int count=0;
		boolean leapyear=false;
		for(int i =101;i<=2100;i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				leapyear=true;
				years=" "+i;
		
				if(leapyear) {
				count++;
			}
			
		
			
			if(count%TEN_PER_LİNE==0)
				System.out.println(years);
			
			else
				
				System.out.print(years+" ");
		
				
			}
	}}
}
		
		
