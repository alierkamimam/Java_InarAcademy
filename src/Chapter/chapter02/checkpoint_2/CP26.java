package Chapter.checkpoint_2;

public class CP26 {
	public static void main(String[] args) {
		
		int a = 6;
		int b = a++;//7
		System.out.println(a);//7
		System.out.println(b);//6
		a = 6;
		b = ++a;
		System.out.println(a);//7
		System.out.println(b);//7
	}

}
