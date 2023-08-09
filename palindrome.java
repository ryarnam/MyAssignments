package Assignments;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = str.next();
		String r = "";
		for(int i=s1.length()-1;i>=0;i--) {
			r= r+s1.charAt(i);
			
		}
		System.out.print(r);
		
		if(s1.equalsIgnoreCase(r)) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
		
		
	}
}


