package Chapter.chapter_05.homework_05;

public class exercises20 {
	public static void main(String[] args) {
		
		int countnumber=10;
		int count=0;
		int number=2;
		
		while(count<=1002) {
		if(number<=1000) {
			boolean isPrime=true;
			
			for(int divisior=2;divisior<=number/2;divisior++) {
				
				if(count%divisior==0) {
					isPrime=false;
					
				}
				
				if(isPrime) {
					count++;
				}
				if(count%countnumber==0)
					System.out.println(number);
				else
					System.out.println(number+"");
				
			}
			number++;
		
		}
	}

}
}