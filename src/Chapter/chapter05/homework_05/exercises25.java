package Chapter.chapter_05.homework_05;

public class exercises25 {
	public static void main(String[] args) {
		
  double sum=0;
	for(int i=1;i<=100000;i++) {							//π is  3.1414926535900345 for 10000
		double pi=4*(Math.pow(-1, i+1)/(2*i-1));		    //π is  3.1415426535898248 for 20000
		sum+=pi;											//π is  3.1415826535897198 for 100000
		
		
	}
	System.out.println("π is  "+sum);

	}

}
