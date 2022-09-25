package Chapter.Chapter_04.Exercises;
import java.util.Scanner;
public class LotteryUsingStrings {
	
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
       String lottery = ""+(int)(Math.random()*10)+ (int)(Math.random()*10);
       
       System.out.println("Enter your lottery pick (two digits)");
       String guess = input.nextLine();
       
       char lottery1 = lottery.charAt(0);
       char lottery2 = lottery.charAt(1);
       
       
       char guess1= guess.charAt(0);
       char guess2= guess.charAt(1);
       
       System.out.println("The lottery number is " + lottery );
       
       if (guess.equals(lottery)) {
    	   System.out.println("Exact match : you win $10.000");
       }else if (guess2 == lottery1
    		   &&guess1 == lottery2) {
    	   System.out.println("Match all digits: you win $3.000");
       }else if (guess1==lottery1 || 
    		     guess1==lottery2 ||
    		     guess2==lottery1 ||
    		     guess2==lottery2) {
    	   System.out.println("Match one digit : you win $1.000");
       } else {
    		   System.out.println("Sorry no match");
       }
       }
    	   


}
