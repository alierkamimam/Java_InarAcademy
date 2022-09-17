package Chapter.chapter_05.homework_05;

public class exercises26 {
	public static void main(String[] args) {
		int value=100000;
		double e=0.0;
		
		for (int a =1;a<=value;a++) {			// e is 1.7182818284590455
												// e is 1.7182818284590455
			double demo=a;						// e is 1.7182818284590455
			for(int k =a-1;k>=1;k--) {
				demo*=k;
				
			}
			e+=1/demo;
			
		}
		System.out.println(value);
		System.out.println("e is "+e);
	}

}
