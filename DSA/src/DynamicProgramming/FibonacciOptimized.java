package DynamicProgramming;

import java.util.Scanner;

public class FibonacciOptimized {
	
	public static void main(String ...args)
	{	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int fibN= fibonacciTabOptimized(n);
		System.out.println(fibN);
		
	}

	private static int fibonacciTabOptimized(int n) {
		if(n==0 || n==1)
		{
			return n;
		}
		int first=0;
		int secnd=1;
		for(int i=2 ; i<=n ; i++)
		{
			int third= first+secnd;
			first= secnd;
			secnd= third;
		}
		
		return secnd;
	}

}
