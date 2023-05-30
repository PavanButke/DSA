package Recursion;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fn= factorial(n);
		System.out.println(fn);
	}

	private static int factorial(int n){
		if(n==0)
		{
			return 1;
		}
		int myfn= factorial(n-1);
		int fnno= n*myfn;
		return fnno;
	}
}
