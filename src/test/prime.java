package test;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int enterednumber = scan.nextInt();
		boolean isPrime = checkPrimeNumber(enterednumber);
		if (isPrime) {
			System.out.println("Entered number is a prime number");

		}
		else {
			System.out.println("Entered number is not a prime number");

		}

	}

	public static boolean checkPrimeNumber(int enterednumber) {
		if (enterednumber == 2 || enterednumber == 3 || enterednumber == 5 || enterednumber == 7) {
			return true;
		} else {
			int a = enterednumber % 2;
			int b = enterednumber % 3;
			int c = enterednumber % 5;
			int d = enterednumber % 7;
			if (a == 0 || b == 0 || c == 0 || d == 0) {
				return false;
			} else {
				return true;
			}
		}

	}

}
