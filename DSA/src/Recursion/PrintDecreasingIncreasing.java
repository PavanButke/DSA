package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		printDecIncr(n);
	}

	private static void printDecIncr(int n) {
		if(n==0)
			return;
		System.out.println(n);
		printDecIncr(n-1);
		System.out.println(n);
	}

}
