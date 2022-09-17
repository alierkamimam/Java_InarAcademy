package Chapter.chapter_05.homework_05;

public class exercises24 {
	public static void main(String[] args) {
		
		
		double sum =0;
		
		
		for(double a=1.0,b=3.0;a<=97.0 && b<=99;a+=2,b+=2) {
			sum=sum+(a/b);
		}
		System.out.println(sum);
	}

}
