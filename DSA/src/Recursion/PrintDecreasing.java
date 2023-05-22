package Recursion;

import java.util.Scanner;

public class PrintDecreasing {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		printDec(n);
	}

	private static void printDec(int n) {
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printDec(n-1);
	}
}
