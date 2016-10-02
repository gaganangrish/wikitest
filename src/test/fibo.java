package test;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String scan;
		System.out.println("Enter first number");
		Scanner scan1=new Scanner(System.in);
		int firstnumber=scan1.nextInt();
		System.out.println("Entered string is:"+firstnumber);
		

		System.out.println("Enter second number");
		Scanner scan2=new Scanner(System.in);
		int secondnumber=scan2.nextInt();
		System.out.println("Entered string is:"+secondnumber);
		
		int addition=firstnumber+secondnumber;
//		System.out.println("Addition of first and second number is:"+addition);
System.out.println("Fibo series:"+"\n"+firstnumber+"\n"+secondnumber);
		
		//System.out.println("Fibo series is:"+firstnumber+" "+secondnumber+" "+addition);
//		System.out.println("Fibo series is:"+firstnumber+" "+secondnumber+" "+addition);
		for (int i = firstnumber; i < 100; i++) {

			 if (addition<100) {

					firstnumber=secondnumber;
					secondnumber=addition;
					 addition=firstnumber+secondnumber;
					 System.out.println(addition);
					 
			}
			

		}
	}


}