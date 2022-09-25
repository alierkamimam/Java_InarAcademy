package Chapter.Chapter_04.Exercises;

public class ex4 {
	public static void main(String[] args) {
		
		
		int i= '2'+'3';
		System.out.println(i);
		
		int j= 2 +'a';
		j++;
		System.out.println((char)j );
		
		System.out.println(('b'<'a')?true:false);
		
		char ch =' ';
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"is an upper case letter");
		
		System.out.println(Character.isLetterOrDigit('A'));
		
	}

}
