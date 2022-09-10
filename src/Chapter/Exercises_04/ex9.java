package Chapter.Chapter_04.Exercises;

public class ex9 { 
	public static void main(String[] args) {
		String str1="Merhaba java";
		String str2="MerHAba java";
		
		boolean b = str1.equalsIgnoreCase(str2);
		/*if (b) {
			System.out.println("equal");
		}else {
			System.out.println(" not equal");
		}*/
		//System.out.println(b);
		
		//System.out.println(b);
		
		str1="Java";
		str2="JAVA";
		if ( str1.compareToIgnoreCase(str2)==0) {
			System.out.println("eşit");
		}else if(str1.compareTo(str2)>0 ){
			System.out.println(str1 +"büyüktür"+str2 + "den");
		}else {
			System.out.println(str1 + "küçüktür"+ str2 +"den"); 	
			}
		
	}
}
