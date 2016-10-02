package test;

import java.util.Scanner;

public class Palandrom {

	public static void main(String[] args) {
		
		
	String originalStr="Madam";
//		Scanner scan=new Scanner(System.in);
//		String s=scan.nextLine();
//	System.out.println("You entered string:"+" "+s);
		char[] array=originalStr.toCharArray();
		
		String revstr="";
//		System.out.println(array.length);
//		System.out.println(array[0]);
//		
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}
		for (int i = array.length-1; i >=0; i--) {
			revstr=revstr+array[i];
			
		}
		System.out.println("Original string:" +" "+originalStr);
		System.out.println("Reversed string:" +" "+revstr);
		boolean isTrue=originalStr.equalsIgnoreCase(revstr);
		if (isTrue) {
			System.out.println("The string is palindrome");
			
		}
		else {
			System.out.println("The string is not palindrome");
		}
		}
	}


