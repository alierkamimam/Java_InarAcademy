package Chapter.Chapter_04.homework_04;

public class B04A25 {
	public static void main(String[] args) {
		
	int letter1= (int)(Math.random()*26+65);//for letter
	int letter2= (int)(Math.random()*26+65);//for letter
	int letter3= (int)(Math.random()*26+65);//for letter
	
	char a=(char)letter1;
	char b=(char)letter2;
	char c=(char)letter3;
	
	
	int number1=(int)(Math.random()*10);
	int number2=(int)(Math.random()*10);
	int number3=(int)(Math.random()*10);
	int number4=(int)(Math.random()*10);
	
	
	System.out.println(" vehicle plate number " +a + b+ c+ "  " + number1+number2+number3+number4);
	
		
	}

}
