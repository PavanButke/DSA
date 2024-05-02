package Recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		printIncreasing(n); //5
	}

	private static void printIncreasing(int n) {
		if(n==0)
			return;
		//System.out.println(n);
		printIncreasing(n-1);
		System.out.println(n);
	}
}
