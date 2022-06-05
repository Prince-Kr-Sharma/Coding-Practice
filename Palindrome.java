package RecursionAndBacktracking;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		String name= sc.next();
		System.out.println(pali(name,0));
		
		sc.close();
	}
	
	static boolean pali(String str, int s) {
		
		if(s==((str.length()-1)/2))
			return true;
		
		if(str.charAt(s)!=str.charAt(str.length()-1-s))
			return false;
		return pali(str,s+1);
		
	}

}
